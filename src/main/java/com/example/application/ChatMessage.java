package com.example.application;

import java.time.LocalDateTime;
public class ChatMessage {
    private final String from;
    private final LocalDateTime time;
    private final String message;

    public ChatMessage(String from, String message) {
        this.from = from;
        this.message = message;
        this.time = LocalDateTime.now();
    }

    public String getFrom() {
        return from;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
