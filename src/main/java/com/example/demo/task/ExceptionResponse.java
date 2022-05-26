package com.example.demo.task;

public class ExceptionResponse {
    private String message;
    private String httCodeMessage;

    public ExceptionResponse(String message, String httCodeMessage) {
        this.message = message;
        this.httCodeMessage = httCodeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttCodeMessage() {
        return httCodeMessage;
    }

    public void setHttCodeMessage(String httCodeMessage) {
        this.httCodeMessage = httCodeMessage;
    }
}
