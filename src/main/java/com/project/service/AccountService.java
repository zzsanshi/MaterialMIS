package com.project.service;

import com.project.domain.Account;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface  AccountService {
    // 查询所有账户
//    @Async
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);
}
