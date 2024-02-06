package com.example.cardapio.food;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;
}
