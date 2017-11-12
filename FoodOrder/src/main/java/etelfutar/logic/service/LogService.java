package etelfutar.logic.service;

import etelfutar.logic.exceptions.UserNotValidException;
import etelfutar.logic.model.Food;
import etelfutar.logic.model.User;

import javax.servlet.http.HttpServletRequest;

public interface LogService {

    User login(String username, String password, HttpServletRequest request) throws UserNotValidException;
    boolean logout(HttpServletRequest request);
    public User register(User user);
    public boolean isLoggedIn();

}
