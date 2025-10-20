package com.Test.Customer_service;

import com.Test.Customer_service.Entity.Customer;
import com.Test.Customer_service.Repository.Customerrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

//      @Bean
//      CommandLineRunner(Customerrepository customerrepository){
//
//        return  args -> {
//            Customer customer1=Customer.builder()
//                    .firstname("youssef")
//                    .lastname("kamouni")
//                    .email("ahme@gmail.com")
//                    .build()  ;
//
//            customerrepository.save(customer1) ;
//
//
//        }   ;



}
