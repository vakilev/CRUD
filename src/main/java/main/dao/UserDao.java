package main.dao;

import main.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(long id);

    void save(User user);

    void delete(long id);

    void update(User user);
}
