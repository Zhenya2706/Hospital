package Impl;

import Service.AuthService;
import dao.AuthDao;

import java.util.List;

public class AuthServiceImpl implements AuthService {

    AuthDao authDao;


    public void addAuth(Auth auth) {
        this.authDao.addAuth(auth);
    }


    public void updateAuth(Auth auth) {
        this.authDao.updateAuth(auth);
    }


    public void removeAuth(Integer id) {
        this.authDao.removeAuth(id);
    }


    public Auth getAuthById(Integer id) {
        return this.authDao.getAuthById(id);
    }


    public List<Auth> listAuthes() {
        return this.authDao.listAuthes();
    }
}

