package com.albertodamaso.eventoys.service;

import  com.albertodamaso.eventoys.model.User;

import java.util.List;

public interface UserService {
    public  User saveUser(User User);
    public List<User> getAllUsers();
    public User get(Long id);
    public void delete(Long id);
}