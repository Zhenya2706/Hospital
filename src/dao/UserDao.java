package dao;

import Entities.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void removeUser(Integer id);

    User getUserById(Integer id);

    User getUserByUsername(String username);

    List<User> listUsers();

    List<User> listUsersByRoleDoctor();
}
