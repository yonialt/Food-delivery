package com.firsttime.yoni.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "foods", nullable = false)
    private Long foods;
    @Column(name = "price", nullable = false)
    private Double price;
    
}