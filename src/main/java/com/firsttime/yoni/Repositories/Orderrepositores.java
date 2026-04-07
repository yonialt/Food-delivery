package com.firsttime.yoni.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firsttime.yoni.model.Order;

public interface Orderrepositores extends JpaRepository<Order,Long> {

    
    
}
