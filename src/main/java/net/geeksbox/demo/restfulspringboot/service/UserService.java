package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    public User checkAccount(String email,String password);
}

