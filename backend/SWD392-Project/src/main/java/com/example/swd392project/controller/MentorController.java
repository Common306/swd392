package com.example.swd392project.controller;

import com.example.swd392project.entity.Mentor;
import com.example.swd392project.service.MentorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MentorController {

    @Autowired
    private MentorService service;

    @GetMapping("/listMentor")
    public List<Mentor> getListMentor() {
        return service.getListMentor();
    }
}
