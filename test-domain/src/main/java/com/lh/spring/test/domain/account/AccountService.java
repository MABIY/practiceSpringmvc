package com.lh.spring.test.domain.account;


import com.lh.spring.test.domain.account.model.Account;
import com.lh.spring.test.domain.account.model.AccountState;
import com.lh.spring.test.domain.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account register(String accountName, String passWorld) {
        Account account = accountRepository.findByName(accountName);
        if (account != null) {
            throw new InvalidParameterException("该用户已存在");
        }

        account = new Account().builder().account(accountName).password(passWorld).state(AccountState.active).build();
        accountRepository.save(account);
        return account;
    }
}
