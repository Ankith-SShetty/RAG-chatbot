package com.example.ragchatbot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {

    @PostMapping("/chat")
    public String handleChat(@RequestBody ChatRequest chatRequest) {
        String userQuery = chatRequest.getQuery();

        return "Response to: " + userQuery;
    }
}

class ChatRequest {
    private String query;

    // Getters and setters

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
