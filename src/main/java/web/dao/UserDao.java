package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void removeUserById(long id);

    void editUser(User user);

    List<User> getUsers();

    User getUserById(long id);

}

