package com.itFactory.proiect.service;

import com.itFactory.proiect.model.User;
import com.itFactory.proiect.repository.UserRepository;
import com.itFactory.proiect.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
        System.out.println("User was added to database: " + user);
    }

    @Override
    public User findUser(String username) {
        User user = userRepository.findUser(username);

        if(user != null){
            System.out.println("User with username: " + username + " was found in the database");
            return user;
        } else {
            System.out.println("User with username: " + username + " was not found in the database");
            return null;
        }
    }

    @Override
    public void deleteUser(String username) {
        User user =userRepository.findUser(username);

        if(user == null){
            System.out.println("User with username: " + username + " was not found in the database");
        } else {
            System.out.println("User with username: " + username + " was DELETED from the database");
            userRepository.deleteUser(user);
        }

    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.listAllUsers();
    }

    @Override
    public void loginUser(User user) {
        //todo:
        //1. Trebuie sa cautam in baza de date userul su username: user.getUsername();
        //2. Daca userul exista verificam daca user.getUsername() este egal cu userBazaDeDate.getUseranme() si user.getPassword() este egal cu userBazaDeDate.getPassword()
        //  sau putem sa facem user.equals(userBazaDeDate) -> true /false



    }
}
