package com.Test.account_service.Repository;

import com.Test.account_service.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositoy extends JpaRepository<Account,Long> {

}
