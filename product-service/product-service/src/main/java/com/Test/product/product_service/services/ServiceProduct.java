package com.Test.product.product_service.services;


import com.Test.product.product_service.entities.Product;
import com.Test.product.product_service.repository.RepositoryProduct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct {

    private final RepositoryProduct repositoryProduct ;

    public ServiceProduct(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public List<Product> getAllProduct(){
        return  repositoryProduct.findAll() ;
    }


    public Product AddProduct(Product p){
        return repositoryProduct.save(p) ;

    }

    public Product UpdateProduct(Product p){

        return repositoryProduct.save(p);

    }

    public Product deleteProduct(Long id) {
        Product p = repositoryProduct.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé avec id: " + id));
        repositoryProduct.delete(p);
        return p;
    }












}
