package com.Test.account_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(AccountRepositoy accountRepositoy) {
//        return args -> {
//            Account account1 = Account.builder()
//                    .accountNumber("454545454544")
//                    .balance(4545454)
//                    .build();
//
//            Account account2 = Account.builder()
//                    .accountNumber("123456789012")
//                    .balance(10000)
//                    .build();
//
//            accountRepositoy.save(account1);
//            accountRepositoy.save(account2);
//
//            System.out.println("✅ Comptes ajoutés !");
//        };
//    }

}



