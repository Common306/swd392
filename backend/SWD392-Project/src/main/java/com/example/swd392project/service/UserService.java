package com.example.swd392project.service;

import com.example.swd392project.entity.User;
import com.example.swd392project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User updateCV(User cvUpdate) {
        return repository.save(cvUpdate);
    }

    public User getCV(int id) {
        return repository.findById(id).orElse(null);
    }
}
