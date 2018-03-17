package com.lh.spring.test.application.account;

import com.lh.spring.test.domain.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterService {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void register() {
        System.out.println("fdsafdas");
    }
}
