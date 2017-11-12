package etelfutar.logic.service;

import etelfutar.api.UserApiController;
import etelfutar.logic.Status;
import etelfutar.logic.model.Order;
import etelfutar.logic.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface OrderService {
    
    boolean makeOrder(Order order);

    void setStatus(Status status, Order o);

    Iterable<Order> findAll();
}
