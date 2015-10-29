
package itis.repository;

import itis.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void addUser(User user);

}