package com.Test.Customer_service.ResetControllers;


import com.Test.Customer_service.Entity.Customer;
import com.Test.Customer_service.Repository.Customerrepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Customercontroller {

    private Customerrepository customerrepository ;

    @GetMapping("/Account")
    private List<Customer> GetAllCutomer(){

        return  customerrepository.findAll() ;
    }


}
