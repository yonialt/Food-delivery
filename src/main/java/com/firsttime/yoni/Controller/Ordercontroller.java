package com.firsttime.yoni.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firsttime.yoni.Service.Orderservice;
import com.firsttime.yoni.model.Order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/orders")
public class Ordercontroller {
    public final Orderservice service;
public Ordercontroller(Orderservice service){
    this.service = service;
}
@PostMapping("/addorder")
public Order addOrder(@RequestBody Order order) {

    
    return service.addOrder(order);
}
@GetMapping("/get")
public List<Order> getAllOrder(@RequestParam String param) {
    return service.getAllOrders();
}
@GetMapping("/{id}")
public Order getOrderById(@PathVariable Long id) {
    return service.getOrderById(id);
@DeleteMapping("/{id}")
public ResponseEntity<String> delete(@PathVariable Long id) {
    service.deleteOrder(id);
    return ResponseEntity.ok("Order deleted successfully");


}
