package com.example.demo.task;

import org.springframework.stereotype.Service;

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

    public int updateTask(Task task) throws BadRequestException {
        boolean taskExists = taskRepository.findById(task.getId()).isPresent();

        if(!taskExists){
            throw new BadRequestException(TASK_NOT_FOUND);
        }
        if(task.getDescription().isEmpty()){
            throw new BadRequestException(EMPTY_DESCRIPCION);
        }
        return taskRepository.updateTask(task);
    }
}
