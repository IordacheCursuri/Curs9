package com.itFactory.proiect.service;

import com.itFactory.proiect.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User findUser(String username);

    void deleteUser(String username);

    List<User> listAllUsers();


    void loginUser(User user);

}
