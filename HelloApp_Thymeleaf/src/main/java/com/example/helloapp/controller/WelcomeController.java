package com.example.helloapp.controller;

import com.example.helloapp.model.WelcomeMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = LocalDateTime.now().format(formatter);

        WelcomeMessage msg = new WelcomeMessage("Hè Hé Boy!", currentTime);
        model.addAttribute("welcome", msg);
        return "welcome";
    }
}
