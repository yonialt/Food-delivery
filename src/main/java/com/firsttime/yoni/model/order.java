package com.firsttime.yoni.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
   @ManyToOne
 private User customer;
@ManyToOne
    private Resturant resturant;
    private Menu menu;
    private Double  price;
}
