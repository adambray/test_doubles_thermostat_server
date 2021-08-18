package com.example.smarthome.server.server;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaterController {
    @PostMapping("/heater")
    public void command(@RequestParam("power") String power) {
        System.out.println(power);
    }
}

