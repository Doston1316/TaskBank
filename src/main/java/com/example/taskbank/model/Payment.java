package com.example.taskbank.model;

import com.example.taskbank.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date time;
    private float amount;
    @ManyToOne
    private Invoice invoice;
    @Enumerated(EnumType.STRING)
    private Status status;
}
