package com.firsttime.yoni.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class order {
   @ManyToOne
 private User customer;
@ManyToOne
    private Resturant resturant;
    private menu menu;
    private menu price;
}
