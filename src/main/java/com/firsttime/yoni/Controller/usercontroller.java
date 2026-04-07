package com.firsttime.yoni.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.firsttime.yoni.Service.Userservice;
import com.firsttime.yoni.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/users")
public class usercontroller {

    private final Userservice Service;

    public usercontroller(Userservice Service){
        this.Service= Service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return Service.registerUser(user); 
    }
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return Service.getAllUsers();
    }   
}
