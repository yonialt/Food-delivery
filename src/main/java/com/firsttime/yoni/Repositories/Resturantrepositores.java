package com.firsttime.yoni.Repositories;
import com.firsttime.yoni.model.Resturant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Resturantrepositores extends JpaRepository <Resturant,Long>{

}