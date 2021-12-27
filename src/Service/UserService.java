package Service;

public interface UserService {
    void addUser(User user);

    void updateUser (User user);

    void removeUser (Integer id);

    User getUserById (Integer id);

    User getUserByUsername(String username);

    List<User> listUsers();

    List<User> listUsersByRoleDoctor();
}
