package com.bogdan;

import java.util.List;

public interface Storage {

    void removeAll();

    void removeUserById(int id);

    void removeUserByName(String name);

    void addUser(User user);

    void updateUser(User user);

    User getUser(int id);

    List<User> getAllUsers();
}
