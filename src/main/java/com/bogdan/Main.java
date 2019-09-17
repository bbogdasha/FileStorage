package com.bogdan;

public class Main {

    public static void main(String[] args) {

        UserDao user = new UserDao();
        user.addUser(new User(1, "Bob", 22));
        user.addUser(new User(2, "Viki", 34));
        user.addUser(new User(3, "Dan", 52));
        user.addUser(new User(4, "Mia", 24));
        user.addUser(new User(5, "Alexxxx", 33));
        user.addUser(new User(6, "Nina", 26));
        user.addUser(new User(7, "Georg", 19));
        user.addUser(new User(8, "Vasily", 45));
        user.addUser(new User(9, "Billy", 31));
        user.addUser(new User(10, "Ana", 20));
        System.out.println(user.getAllUsers() + "\n===================================");

        System.out.println("Delete user by name Dan and user by id (4) Mia: ");
        user.removeUserByName("Dan");
        user.removeUser(4);
        System.out.println(user.getAllUsers() + "\n===================================");

        System.out.println("Get user by id (5): ");
        System.out.println(user.getUser(5) + "\n===================================");

        System.out.println("Change data about user: ");
        user.updateUser(user.getUser(5), new User(5, "Alex", 33));
        System.out.println(user.getUser(5) + "\n===================================");

        System.out.println("Save data about users in file 'UserData.txt': ");
        FileStorage fileStorage = new FileStorage();
        fileStorage.set(user.getAllUsers());

        System.out.println("Clear list users: ");
        user.removeAll();
        System.out.println(user.getAllUsers());
    }
}
