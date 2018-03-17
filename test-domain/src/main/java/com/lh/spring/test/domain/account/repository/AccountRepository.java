package com.lh.spring.test.domain.account.repository;

import com.lh.spring.test.domain.account.model.Account;
import com.lh.spring.test.domain.repository.CRUDRepository;

public interface AccountRepository extends CRUDRepository<Account, Integer> {
    Account findByName(String accountName);
}
