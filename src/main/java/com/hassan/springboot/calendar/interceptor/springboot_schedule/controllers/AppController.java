package com.hassan.springboot.calendar.interceptor.springboot_schedule.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo(){
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Welcome to authentication app, the app is open from x to y time");
        data.put("date", new Date());
        return ResponseEntity.ok(data);

    }
    
}
