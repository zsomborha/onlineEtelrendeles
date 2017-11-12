package etelfutar.logic.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import etelfutar.logic.model.User;
import etelfutar.repository.UserRepository;

@Service
@SessionScope
@Data
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;




public void save(User user){
    userRepository.save(user);
}


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
