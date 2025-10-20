package com.Test.product.product_service.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product ;
    @Column(nullable = false)
    private String name;

    private String description;

    private String category;

    private Double price;

    private Integer quantity;

    private String unit;

    private String sku;


    private String imageUrl;

}
