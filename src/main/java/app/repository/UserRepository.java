package app.repository;



import app.model.User;

import java.util.List;

public interface UserRepository {
    List<User> index();
    User show(int id);
    void save(User myUser);
    void update(User updatedMyUser);
    void delete(int id);
    User findByName(String name);
}
