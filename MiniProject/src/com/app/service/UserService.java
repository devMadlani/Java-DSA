package com.app.service;

import com.app.modal.User;
import com.app.repository.UserRepository;

public class UserService {
    private UserRepository repo = new UserRepository();

    public void createUser(int id, String name, String email) {
        User user = new User(id, name, email);
        repo.addUser(user);
    }

    public void getAllUsers() {
        for (User user : repo.getUsers()) {
            System.out.println(user);
        }
    }

    public void findUser(int id) {
        User user = repo.findById(id);
        if (user == null) {
            System.out.println("User Not Found");
        } else {
            System.out.println(user);
        }
    }

    public void deleteUser(int id) {
        boolean deleted = repo.deleteUser(id);
        System.out.println(deleted ? "Delete" : "User not found");
    }
}
