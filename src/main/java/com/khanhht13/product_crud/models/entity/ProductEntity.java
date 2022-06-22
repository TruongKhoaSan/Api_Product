package com.khanhht13.product_crud.models.entity;


import jdk.jfr.Enabled;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="product")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Integer price;

    private String sku;

    private String description;

}
