package com.firsttime.yoni.Service;
import com.firsttime.yoni.Repositories.Resturantrepositores;
import com.firsttime.yoni.model.Resturant;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Resturantservice {
    private final Resturantrepositores Repository;

    public Resturantservice(Resturantrepositores Repository) {
        this.Repository = Repository;
    }
    public Resturant addResturant(Resturant resturant) {
        return Repository.save(resturant);
    }
    public List<Resturant> getAllResturants() {
        return Repository.findAll();
    }
    public Resturant getResturantById(Long id) {
        return Repository.findById(id).orElseThrow(() -> new RuntimeException("Resturant not found"));
    }
    public void deleteResturant(Long id) {
        Repository.deleteById(id);
    }
    
}
