package com.example.demo.task;

import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PutMapping(path ="/tasks/{id}")
    public Task update(@RequestBody Task task, @PathVariable("id") Long id) throws BadRequestException {
        task.setId(id);
        taskService.updateTask(task);
        Task updatedTask = taskService.loadTaskById(task.getId());
        return updatedTask;

    }
}
