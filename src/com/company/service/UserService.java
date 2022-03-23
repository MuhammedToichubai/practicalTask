package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    void addUser(List<User> mas, User user);
    int searchIDMn(List<User> mas, int id);
    int removeIDMn(List<User> mas, int id);
    int getAll(List<User> mas);

}
