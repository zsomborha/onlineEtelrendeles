package etelfutar.logic.service;

import etelfutar.logic.Status;
import etelfutar.logic.model.Order;
import etelfutar.repository.OrderRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Data
public class OrderServiceImpl implements OrderService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public boolean makeOrder(Order order) {
        //OrderRepository.save(user);
        if (order.getFood()== null){
            return false;
        }
        if (order.getUser() == null){
            return false;
        }

        orderRepository.save(order);
        return true;

    }


    public void setStatus(Status status, Order order){
        order.setStatus(status);
    }


    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }









/*
    @Override
    public User getUser() {
        String username = getUsername();
        if(username != null) {
            return userService.findByUsername(username);
        }

        return null;
    }

    @Override
    public Boolean isAuthenticated() {
        return getUsername() != null;
    }

    @Override
    public String getUsername() {
        UserDetails userDetails = getUserDetails();
        if(userDetails != null) {
            return userDetails.getUsername();
        }

        return null;
    }

    @Override
    public UserDetails getUserDetails() {
        Object userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userDetails instanceof UserDetails) {
            return ((UserDetails)userDetails);
        }

        return null;
    }

    @Override
    public Boolean login(String username, String password) {
        if(username == null) {
            throw new IllegalArgumentException();
        }

        if(password == null) {
            throw new IllegalArgumentException();
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(userDetails == null) {
            return false;
        }

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(
                        userDetails,
                        password,
                        userDetails.getAuthorities());

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            return true;
        }

        return false;
    }

    @Override
    public Boolean logout() {
        if(isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(null);
            SecurityContextHolder.clearContext();
            return true;
        }

        return false;
    }
    */
}
