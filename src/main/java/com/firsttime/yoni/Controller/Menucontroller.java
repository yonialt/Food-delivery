package com.firsttime.yoni.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firsttime.yoni.model.Menu;
import com.firsttime.yoni.Service.Menuservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/menus")
public class Menucontroller {
    private final Menuservice ser;
    public Menucontroller(Menuservice ser){
    this.ser= ser;
    }
    @PostMapping("/new")
    public Menu addMenu(@RequestBody Menu menu) {
    
        return ser.addMenu(menu);
    }
    @DeleteMapping("/{id}")
     public void delete(@PathVariable Long id){
        ser.deleteMenu(id);
        }
        
    }
    

