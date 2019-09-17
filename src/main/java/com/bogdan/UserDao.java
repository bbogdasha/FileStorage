package com.bogdan;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Storage {

    private List<User> users = new ArrayList<User>();

    public void removeAll() {
        users.clear();
    }

    public void removeUser(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
            }
        }
    }

    public void removeUserByName(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.remove(i);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(User user, User update) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, update);
            }
        }
    }

    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
