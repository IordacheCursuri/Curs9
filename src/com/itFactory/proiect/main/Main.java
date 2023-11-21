package com.itFactory.proiect.main;

import com.itFactory.proiect.controller.UserController;
import com.itFactory.proiect.model.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("********************************************************** \n");
            System.out.println("Comand: ");
            System.out.println("create : find : delete : list : exit");

            String command = scanner.nextLine();


            switch (command.toLowerCase().trim()) {

                case "create":
                    System.out.println("Insert username & password: ");
                    String userCredentials[] = scanner.nextLine().split(" ");

                    String username = userCredentials[0];
                    String password = userCredentials[1];

                    User user = new User(username, password);

                    userController.addUser(user);
                    break;

                case "find":
                    System.out.println("Insert username to find: ");
                    String findUsername = scanner.nextLine();
                    userController.findUser(findUsername);
                    break;

                case "list":
                    List<User> userList = userController.listAllUsers();
                    System.out.println(userList);
                    break;

                case "exit":
                    System.exit(0);
                    break;

                case "delete":
                    System.out.println("Insert username to delete: ");
                    String deleteUsername = scanner.nextLine();
                    userController.deleteUser(deleteUsername);
                    break;

                case "login":
                    System.out.println("Inser username & password");



                    break;

                default:
                    System.out.println("Wrong command:");






            }
















        }




    }


}
