package com.Test.product.product_service;

import com.Test.product.product_service.entities.Product;
import com.Test.product.product_service.repository.RepositoryProduct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

//    CommandLineRunner(RepositoryProduct repositoryProduct){
//
//        return  args -> {
//            Product product1=Product.builder()
//                    .name("hjfk")
//                    .description("hjf")
//                    . category (("rgbrvr"))
//                    .price(525.55)
//                    .quantity(25)
//                    . unit("8525")
//                    . sku("rgbrvr")
//                    . imageUrl("rfverv")
//                    .build() ;
//            repositoryProduct.save(product1) ;
//        } ;



}
