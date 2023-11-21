package com.itFactory.proiect.controller;

import com.itFactory.proiect.model.User;
import com.itFactory.proiect.service.UserService;
import com.itFactory.proiect.service.UserServiceImpl;

import java.util.List;

public class UserController {

    private final UserService userService = new UserServiceImpl();


    public void addUser(User user){
        userService.addUser(user);
    }

    public User findUser(String username){
        return userService.findUser(username);
    }


    public void deleteUser (String username){
        userService.deleteUser(username);
    }

    public List<User> listAllUsers() {
        return userService.listAllUsers();
    }

    public void loginUser(User user){

    }






}
