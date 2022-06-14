package com.hackerearth.warehouse.controller;

import com.hackerearth.warehouse.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/status")
    public ResponseEntity<Message> getSystemStatus() {
        return ResponseEntity.ok().body(new Message("status:UP"));
    }

}
