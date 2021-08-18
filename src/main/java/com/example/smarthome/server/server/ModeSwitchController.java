package com.example.smarthome.server.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModeSwitchController {
    @GetMapping("/currentMode")
    public String getCurrentMode() {
        return "OFF";
    }
}
