package com.example.swd392project.service;

import com.example.swd392project.entity.Mentor;
import com.example.swd392project.repository.MentorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {

    @Autowired
    private MentorRepository repository;

    public List<Mentor> getListMentor() {
        return repository.findAll();
    }
}
