package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;
}
