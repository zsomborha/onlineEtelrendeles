package etelfutar.api;

import etelfutar.logic.Status;
import etelfutar.logic.UserValidator;
import etelfutar.logic.exceptions.UserNotValidException;
import etelfutar.logic.model.Order;
import etelfutar.logic.service.LogService;
import etelfutar.logic.service.OrderService;
import etelfutar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import etelfutar.logic.annotations.Authenticated;
import etelfutar.logic.annotations.NotAuthenticated;
import etelfutar.logic.model.User;
import etelfutar.logic.service.UserService;

import static sun.net.ftp.FtpDirEntry.Permission.USER;

@RestController
@RequestMapping("/api/user")
public class UserApiController {
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;
    @Autowired
    private UserValidator userValidator;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserRepository userRepository;


    private User user;

    public User login(User user) throws UserNotValidException {
        if (UserValidator.validator(user)) {
            return this.user = userRepository.findByUsername(user.getUsername());
        }
        throw new UserNotValidException();
    }

    public User register(User user) {

        this.user = userRepository.save(user);
        return user;
    }



    public boolean isLoggedIn() {
        return user != null;
    }



    @Authenticated
    @PostMapping("/order")
    public ResponseEntity<Order> order(@RequestBody Order order, BindingResult bindingResult){
        if(orderService.makeOrder(order)){
            return ResponseEntity.ok(order);
        }
        return ResponseEntity.badRequest().build();
    }


    @Authenticated
    @PostMapping("status")
    public ResponseEntity<Status> status(@RequestBody Status status, @RequestBody Order order){
        orderService.setStatus(status, order);
        return  ResponseEntity.ok(status);
    }





}