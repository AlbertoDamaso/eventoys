package com.albertodamaso.eventoys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.albertodamaso.eventoys.exception.UserNotFoundException;
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

    @GetMapping("/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
            .orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return  "Usuário com id "+id+", deletado com sucesso.";
    }    
}
