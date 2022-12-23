package com.albertodamaso.eventoys.service;

import com.albertodamaso.eventoys.model.User;
import com.albertodamaso.eventoys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository UserRepository;

    @Override
    public User saveUser(User User) {
        return UserRepository.save(User);
    }

    @Override
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }
    @Override
    public User get(Long id){
        return UserRepository.findById(id).get();
    }
    @Override
    public void delete(Long id){
        UserRepository.deleteById(id);
    }
}