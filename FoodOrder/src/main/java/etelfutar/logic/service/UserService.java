package etelfutar.logic.service;

import etelfutar.logic.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
