package com.itFactory.proiect.repository;

import com.itFactory.proiect.model.User;

import java.util.List;

public interface UserRepository {

    void addUser(User user);

    User findUser(String username);

    void deleteUser(User user);

    List<User> listAllUsers();


}
