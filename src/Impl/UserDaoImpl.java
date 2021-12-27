package Impl;

import Service.AuthService;
import dao.UserDao;

import java.util.logging.Logger;

public class UserDaoImpl implements UserDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    AuthService authService;

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        user.setCreateDate(new java.util.Date());
        getSession().persist(user);
        LOGGER.info("Entities.User successfully saved. Entities.User details: " + user);
    }

    @Override
    public void updateUser(User user) {
        user.setUpdateDate(new java.util.Date());
        getSession().update(user);
        LOGGER.info("Entities.User successfully update. Entities.User details: " + user);
    }

    @Override
    public void removeUser(Integer id) {

        User user = (User) getSession().load(User.class, id);

        if(user !=null){
            getSession().delete(user);
        }
        LOGGER.info("Entities.User successfully removed. Entities.User details: " + user);
    }

    @Override
    public User getUserById(Integer id) {

        User user = (User) getSession().load(User.class, id);
        LOGGER.info("Entities.User successfully loaded. Entities.User details: " + user);

        return user;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User getUserByUsername(String username) {

        Query query = getSession().createQuery("from Entities.User where auth.username = :username");
        query.setParameter("username", username);
        User user = (User)  query.uniqueResult();
        LOGGER.info("Userdetails successfully loaded. Entities.User details: " + user);

        return user;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {

        List<User> userList = getSession().createQuery("from Entities.User ORDER BY lastname ASC").list();

        for(User user : userList){
            LOGGER.info("Entities.User list: " + user);
        }

        return userList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsersByRoleDoctor() {
        List<User> doctorList = getSession().createQuery("from Entities.User where auth.isActive='1' "
                + "and auth.role='ROLE_DOCTOR' ORDER BY lastname ASC").list();
        for(User user : doctorList){
            LOGGER.info("Doctor list: " + user);
        }
        return doctorList;
    }

}
