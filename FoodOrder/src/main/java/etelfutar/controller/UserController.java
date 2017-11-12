package etelfutar.controller;

//import etelfutar.logic.service.SecurityService;
import etelfutar.logic.service.SecurityService;
import etelfutar.logic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;
import etelfutar.logic.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;



    @Autowired
    private UserValidator userValidator;
}
