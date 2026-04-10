package com.firsttime.yoni.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "resturants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Resturant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "resturant_name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;
    
}
