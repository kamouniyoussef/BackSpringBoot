package com.Test.account_service.ResetControllers;


import com.Test.account_service.Entity.Account;
import com.Test.account_service.Repository.AccountRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {

    private AccountRepositoy accountRepositoy ;

    @GetMapping("/Account")
    private List<Account> GetAllAccount(){

        return  accountRepositoy.findAll() ;
    }


}
