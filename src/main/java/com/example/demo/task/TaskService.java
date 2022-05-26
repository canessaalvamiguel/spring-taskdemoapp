package com.example.demo.task;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final static String TASK_NOT_FOUND = "Cannot find task with given id";
    private final static String EMPTY_DESCRIPCION = "Task description is required";

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task loadTaskById(Long id){
        return taskRepository.findById(id).get();
    }

    @Transactional
    public Task updateTask(Task task) {

        if(task.getDescription() == null || task.getDescription().isEmpty()){
            throw new BadRequestException(EMPTY_DESCRIPCION);
        }

        boolean taskExists = taskRepository.findById(task.getId()).isPresent();
        if(!taskExists){
            throw new NotFoundException(TASK_NOT_FOUND);
        }
        taskRepository.save(task);

        Task updatedTask = loadTaskById(task.getId());
        return updatedTask;
    }
}
