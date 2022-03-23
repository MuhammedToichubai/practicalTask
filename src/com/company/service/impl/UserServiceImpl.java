package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.exceptions.InvalidIdExceptions;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(User user, User user1, User user2, UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(List<User> mas, User user) {
        mas.add(user);
    }


    @Override
    public int searchIDMn(List<User> mas, int id) throws InvalidIdExceptions {
        Optional<User> user = mas.stream().filter(x -> x.getId() == id).findAny();
        try {
            if (user.isEmpty()) {
                throw new InvalidIdExceptions("MYNDAI ID JOK!!!");
            } else {
                System.out.println(user.get());
            }
        } catch (InvalidIdExceptions e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int removeIDMn(List<User> mas, int id) {
        Optional<User> any2 = mas.stream().filter(x -> x.getId() == id).findAny();
        mas.removeIf(x -> x.getId() == id);
        return 0;
    }

    @Override
    public int getAll(List<User> mas) {
        mas.stream().forEach(System.out::println);
        return 0;
    }
}
