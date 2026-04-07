package com.firsttime.yoni.Service;
import com.firsttime.yoni.Repositories.Userrepositores;
import com.firsttime.yoni.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    private final Userrepositores Repository;

    public Userservice(Userrepositores Repository){
        this.Repository = Repository;
    }

    public User registerUser(User user){
        if(Repository.findAll().stream().anyMatch(u -> u.getName().equals(user.getName()))){
            throw new RuntimeException("Name already exists");
        }
        return Repository.save(user);  // this calls the repository method
    }
   public List <User> getAllUsers(){
        return Repository.findAll();
    }
    public User getUserById(Long id){
        return Repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    public void deleteUser(Long id){
        Repository.deleteById(id);
    }
}