package com.lh.spring.test.application.account;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.lh.spring.test.domain.account.AccountService;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

@RestController
public class RegisterService {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/register/{id}", method = RequestMethod.GET)
    @Cacheable(value = "addresses")
    public String register(@PathVariable(value = "id")String id) throws InterruptedException, MemcachedException, TimeoutException {
        System.out.println("fdsafdas");
        return "tesafg";
    }
}
