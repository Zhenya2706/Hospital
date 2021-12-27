package Impl;

import Service.UserService;

public class UserServiceImpl  implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void removeUser(Integer id) {
        this.userDao.removeUser(id);
    }

    @Override
    public User getUserById(Integer id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return this.userDao.getUserByUsername(username);
    }

    @Override
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }

    @Override
    public List<User> listUsersByRoleDoctor() {
        return this.userDao.listUsersByRoleDoctor();
    }
}

