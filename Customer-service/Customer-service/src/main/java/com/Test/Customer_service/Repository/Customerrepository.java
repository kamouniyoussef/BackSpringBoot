package com.Test.Customer_service.Repository;

import com.Test.Customer_service.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Customerrepository extends JpaRepository<Customer,Long> {
}
