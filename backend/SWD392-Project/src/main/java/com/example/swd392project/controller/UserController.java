package com.example.swd392project.controller;

import com.example.swd392project.entity.User;
import com.example.swd392project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/cv/{id}")
    public User getCVbyID(@PathVariable int id) {
        return service.getCV(id);
    }

    @PostMapping("/updatecv")
    public User updateCV(@RequestBody User cvUpdate) {
        return service.updateCV(cvUpdate);
    }
}
