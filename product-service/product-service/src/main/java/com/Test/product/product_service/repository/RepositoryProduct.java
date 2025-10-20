package com.Test.product.product_service.repository;

import com.Test.product.product_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProduct extends JpaRepository<Product,Long> {
}
