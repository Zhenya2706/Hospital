package dao;

public interface AuthDao {
    void addAuth(Auth auth);

    void updateAuth(Auth auth);

    void removeAuth(Integer id);

    Auth getAuthById(Integer id);

    List<Auth> listAuthes();
}

