package com.albertodamaso.eventoys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.albertodamaso.eventoys.model.User;
import com.albertodamaso.eventoys.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
   
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
