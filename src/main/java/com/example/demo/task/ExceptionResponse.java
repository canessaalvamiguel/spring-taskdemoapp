package com.example.demo.task;

public class ExceptionResponse {
    private String message;
    private String status;

    public ExceptionResponse(String message, String httCodeMessage) {
        this.message = message;
        this.status = httCodeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
