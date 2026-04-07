/*package com.firsttime.yoni.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "foods", nullable = false)
    private String foods;  

    @Column(name = "price", nullable = false)
    private Double price;
     @ManyToOne
    @JoinColumn(name = "menu_id") 
    private Menu menu; 
}*/