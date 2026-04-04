package com.firsttime.yoni.Service;
import com.firsttime.yoni.Repositories.Userrepositores;
import com.firsttime.yoni.model.User;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    private final Userrepositores userRepository;

    public Userservice(Userrepositores userRepository){
        this.userRepository = userRepository;
    }

    public User registerUser(User user){
        // logic example: check if email already exists
        if(userRepository.findAll().stream().anyMatch(u -> u.getName().equals(user.getName()))){
            throw new RuntimeException("Name already exists");
        }
        // save to DB
        return userRepository.save(user);  // this calls the repository method
    }
}