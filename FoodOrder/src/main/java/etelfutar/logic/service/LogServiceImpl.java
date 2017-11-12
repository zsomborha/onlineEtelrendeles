package etelfutar.logic.service;

import etelfutar.logic.UserValidator;
import etelfutar.logic.exceptions.UserNotValidException;
import etelfutar.logic.model.Food;
import etelfutar.logic.model.User;
import etelfutar.repository.FoodRepository;
import etelfutar.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpServletRequest;

import static sun.net.ftp.FtpDirEntry.Permission.USER;

@Service
@SessionScope
@Data
public class LogServiceImpl implements LogService {

    private User user;

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password, HttpServletRequest request) throws UserNotValidException {
        if (UserValidator.validator(user)) {
            return this.user = userRepository.findByUsername(user.getUsername());
        }
        throw new UserNotValidException();
    }

    public User register(User user) {
        //user.setRole(USER);
        this.user = userRepository.save(user);
        return user;
    }



    public boolean isLoggedIn() {
        return user != null;
    }

    public boolean logout(HttpServletRequest request){
        try{
            new SecurityContextLogoutHandler().logout(request, null, null);
            return true;
        }catch (Exception e){
            return false;
        }

    }



}
