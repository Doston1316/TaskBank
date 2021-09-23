package com.example.taskbank.model;

import com.example.taskbank.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Invoice invoice;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "order_details")
    private List<Detail>details;
    @Enumerated(EnumType.STRING)
    private Status status;


}
