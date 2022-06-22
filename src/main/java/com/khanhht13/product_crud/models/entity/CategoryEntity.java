package com.khanhht13.product_crud.models.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="category")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  name;

    private String code;

    private Double   status;

    private String description;
}
