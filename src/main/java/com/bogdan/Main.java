package com.bogdan;

public class Main {

    public static void main(String[] args) {

        UserDao user = new UserDao();

        System.out.println("Check the file UserData.txt");
        System.out.println("File contain: \n" + user.getAllUsers());

        System.out.println("Clear list users");
        user.removeAll();
        System.out.println("Check the file UserData.txt");
        System.out.println("File contain: \n" + user.getAllUsers());

        System.out.println("Add new users: ");
        user.addUser(new User(1, "Jack", 19));
        user.addUser(new User(2, "Thomazzz", 23));
        user.addUser(new User(3, "Lily", 22));
        user.addUser(new User(4, "Emily", 18));
        user.addUser(new User(5, "Connor", 31));

        System.out.println(user.getAllUsers() + "\n===================================");

        System.out.println("Delete user by name Jack and user by id 4 (Emily): ");
        user.removeUserByName("Jack");
        user.removeUserById(4);
        System.out.println(user.getAllUsers() + "\n===================================");

        System.out.println("Get user by id (2): ");
        System.out.println(user.getUser(2) + "\n===================================");

        System.out.println("Change data about user: ");
        User newUser = new User(2, "Thomas", 19);
        user.updateUser(newUser);
        System.out.println(user.getAllUsers() + "\n===================================");
    }
}
