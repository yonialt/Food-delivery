package com.firsttime.yoni.Service;
import com.firsttime.yoni.model.Menu;
import com.firsttime.yoni.Repositories.*;
import org.springframework.stereotype.Service;

@Service
public class Menuservice {
    private final Menurespoitories repo;

    public Menuservice( Menurespoitories repo){
        this.repo=repo;
    }
    public Menu addMenu(Menu menu){
        return repo.save(menu);
    }
    public void deleteMenu(Long id){
         repo.deleteById(id);
    }
}
