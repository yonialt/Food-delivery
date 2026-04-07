package com.firsttime.yoni.Service;
import com.firsttime.yoni.Repositories.Orderrepositores;
import com.firsttime.yoni.model.Order;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class Orderservice {
    private final Orderrepositores Repository;
    public Orderservice (Orderrepositores Repositories){
    this.Repository = Repositories;
}
public Order addOrder(Order order){
return Repository.save(order);
}
public List<Order> getAllOrders(){
    return Repository.findAll();
}
public Optional<Order> getOrderByID(Long id){
    return Repository.findById(id);
}
public void deleteOrder(Long id){
    Repository.deleteById(id);
}
}
