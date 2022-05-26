package com.example.demo.task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    private Long id;
    private String description;
    private Long priority;

    public Task(long id, String description, long priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public Task() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }
}
