package com.lh.spring.test.infrastructure.respsitory;

import com.lh.spring.test.domain.account.model.Account;
import com.lh.spring.test.domain.account.repository.AccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryIm implements AccountRepository {
    @Override
    public Account Find(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public int save(Account account) {
        return 0;
    }

    @Override
    public Account findByName(String accountName) {
        return null;
    }
}
