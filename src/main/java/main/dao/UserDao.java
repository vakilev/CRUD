package main.dao;

import main.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(long id);

    void saveUser(User user);

    void deleteUser(long id);

    void updateUser(User user);
}
