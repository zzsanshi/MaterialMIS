package com.project.service.Impl;

import com.project.dao.IAccountdao;
import com.project.domain.Account;
import com.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
@Async
public class AccountServiceImpl  implements AccountService {
    @Autowired
    private IAccountdao iaccountdao;

    @Override
    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iaccountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存帐户...");
//        iaccountdao.saveAccount(account);  //调用service中的saveAccount(account)方法
    }
}
