package com.example.smarthome.server.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThermometerController {
    @GetMapping("/currentTemp")
    public float getTemperature() {
        return 68.4f;
    }
}
