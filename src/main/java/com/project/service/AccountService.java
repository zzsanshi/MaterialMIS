package com.project.service;

import com.project.domain.Account;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface  AccountService {
    // 查询所有账户
//    @Async
    public List<Account> findAll();

    // 保存帐户信息
    public Account saveAccount(Account account);
    //删除账户
    public void deleteAccount(Account account);

    public Account updateAccount(Account account);
}
