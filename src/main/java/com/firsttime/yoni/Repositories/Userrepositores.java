package com.firsttime.yoni.Repositories;
import com.firsttime.yoni.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userrepositores extends JpaRepository<User, Long> {
    
}
