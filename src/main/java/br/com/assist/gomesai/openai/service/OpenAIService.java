package br.com.assist.gomesai.openai.service;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OpenAIService {
    private final OpenAiChatClient chatClient;

    @Autowired
    public OpenAIService(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public Map call(String message) {
        return Map.of("generation", chatClient.call(message));
    }
}
