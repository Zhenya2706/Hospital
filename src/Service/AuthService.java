package Service;

import Entities.Auth;

import java.util.List;

public interface AuthService {
    void addAuth(Auth auth);

    void updateAuth(Auth auth);

    void removeAuth(Integer id);

    Auth getAuthById(Integer id);

    List<Auth> listAuthes();
}

