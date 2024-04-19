package br.com.assist.gomesai.openai.controller;

import br.com.assist.gomesai.openai.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "gomes-ai")
public class OpenAIController {

    @Autowired
    private OpenAIService aiService;

    @GetMapping(value = "call")
    public ResponseEntity<Map> callPrompt(
            @RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return ResponseEntity.ok(aiService.call(message));
    }
}
