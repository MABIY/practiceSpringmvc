package com.lh.spring.test.domain.account.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Integer id;

    private String account;

    private String password;

    private AccountState state;

    private Date createTime;

    private AccountAuthority authority;

}
