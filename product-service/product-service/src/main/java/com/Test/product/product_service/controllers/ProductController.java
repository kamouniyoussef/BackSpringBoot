package com.Test.product.product_service.controllers;


import com.Test.product.product_service.entities.Product;
import com.Test.product.product_service.repository.RepositoryProduct;
import com.Test.product.product_service.services.ServiceProduct;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductController {

     private final ServiceProduct serviceProduct;

     public ProductController(ServiceProduct serviceProduct) {
        this.serviceProduct = serviceProduct;
    }


    @GetMapping("/All")
    public List<Product> getAllProduct(){
        return serviceProduct.getAllProduct() ;
    }
    @PutMapping("/UpdateProduct")
    public Product updateproduct(@RequestBody Product p){
        return serviceProduct.AddProduct(p) ;
    }

    @PostMapping("/AddProduct")
    public Product AddProduct(@RequestBody Product p){
        return serviceProduct.AddProduct(p) ;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id) {
        serviceProduct.deleteProduct(id);
    }










}
