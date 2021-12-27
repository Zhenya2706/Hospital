package Impl;

import dao.AuthDao;

import java.util.logging.Logger;

public class AuthDaoImpl implements AuthDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addAuth(Auth auth) {
        getSession().persist(auth);
        LOGGER.info("Entities.Auth successfully saved. Entities.Auth details: " + auth);
    }

    @Override
    public void updateAuth(Auth auth) {
        getSession().update(auth);
        LOGGER.info("Entities.Auth successfully update. Entities.Auth details: " + auth);
    }

    @Override
    public void removeAuth(Integer id) {

        Auth auth = (Auth) getSession().load(Auth.class, id);

        if(auth !=null){
            getSession().delete(auth);
        }
        LOGGER.info("Entities.Auth successfully removed. Entities.Auth details: " + auth);
    }

    @Override
    public Auth getAuthById(Integer id) {

        Auth auth = (Auth) getSession().load(Auth.class, id);
        LOGGER.info("Entities.Auth successfully loaded. Entities.Auth details: " + auth);

        return auth;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Auth> listAuthes() {

        List<Auth> authList = getSession().createQuery("from Entities.Auth").list();

        for(Auth auth : authList){
            LOGGER.info("Entities.Auth list: " + auth);
        }

        return authList;
    }
}
