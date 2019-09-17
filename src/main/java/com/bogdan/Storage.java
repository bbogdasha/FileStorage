package com.bogdan;

import java.util.List;

public interface Storage {

    void removeAll();

    void removeUser(int id);

    void removeUserByName(String name);

    void addUser(User user);

    void updateUser(User user, User update);

    User getUser(int id);

    List<User> getAllUsers();
}
