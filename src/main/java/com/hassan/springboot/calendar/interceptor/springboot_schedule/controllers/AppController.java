package com.hassan.springboot.calendar.interceptor.springboot_schedule.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo(HttpServletRequest request){
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Welcome to authentication app, the app is open from x to y time");
        data.put("date", new Date());
        data.put("message", request.getAttribute("message"));
        return ResponseEntity.ok(data);

    }
    
}
