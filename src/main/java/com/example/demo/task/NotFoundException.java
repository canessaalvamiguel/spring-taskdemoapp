package com.example.demo.task;

public class NotFoundException extends RuntimeException  {

    public NotFoundException(String msg) {
        super(msg);
    }
}
