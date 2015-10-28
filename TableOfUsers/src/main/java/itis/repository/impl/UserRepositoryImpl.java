package itis.repository.impl;

import itis.model.User;
import itis.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //!!!!
public class UserRepositoryImpl implements UserRepository{

    List<User> users = new ArrayList<User>();

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}