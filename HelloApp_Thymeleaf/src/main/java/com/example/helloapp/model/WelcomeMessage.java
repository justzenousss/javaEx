package com.example.helloapp.model;

import java.time.LocalDateTime;

public class WelcomeMessage {
    private String message;
    private String currentTime;

    public WelcomeMessage(String message, String currentTime) {
        this.message = message;
        this.currentTime = currentTime;
    }

    public String getMessage() {
        return message;
    }

    public String getCurrentTime() {
        return currentTime;
    }
}

