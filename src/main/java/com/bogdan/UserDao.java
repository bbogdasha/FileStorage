package com.bogdan;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Storage {

    private List<User> users = new ArrayList<User>();
    private FileStorage fileStorage = new FileStorage();

    public void removeAll() {
        users.clear();
        fileStorage.write(users);
    }

    public void removeUserById(int id) {
        List<User> users = fileStorage.read();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
            }
        }
        fileStorage.write(users);
    }

    public void removeUserByName(String name) {
        List<User> users = fileStorage.read();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.remove(i);
            }
        }
        fileStorage.write(users);
    }

    public void addUser(User user) {
        if (fileStorage.read().size() != 0) {
            users = fileStorage.read();
        }
        users.add(user);
        fileStorage.write(users);
    }

    public void updateUser(User user) {
        List<User> users = fileStorage.read();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
            }
        }
        fileStorage.write(users);
    }

    public User getUser(int id) {
        List<User> users = fileStorage.read();
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return fileStorage.read();
    }
}
