package com.jx.mall.product;

import jakarta.persistence.*;
import lombok.*; /* Automatically generate getter setter constructor param constructor*/

/* This is ORM (Object-Relational Mapping, use annotations*/
@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}


