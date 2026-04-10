package com.firsttime.yoni.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.firsttime.yoni.Service.Resturantservice;
import com.firsttime.yoni.model.Resturant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("/resturants")
public class Resturantcontroller {
   public final Resturantservice service;
    public Resturantcontroller(Resturantservice service) {
        this.service = service;
    }
    @PostMapping("/add")
    public Resturant addResturant(@RequestBody Resturant resturant) {
        return service.addResturant(resturant);
    }
    @GetMapping("/all")
    public List<Resturant> getAllResturants() {
        return service.getAllResturants();
    }
    @GetMapping("/{id}")
    public Resturant getResturantById(@PathVariable Long id) {
        return service.getResturantById(id);
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id) {
        service.deleteResturant(id);
        
         }
}
