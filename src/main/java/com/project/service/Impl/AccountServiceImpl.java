package com.project.service.Impl;

import com.project.dao.IAccountdao;
import com.project.domain.Account;
import com.project.service.AccountService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service("accountService")
//@Cacheable(value="account")
//@EnableCaching
public class AccountServiceImpl  implements AccountService {
    @Autowired
    private IAccountdao iaccountdao;

    //@Async
    @Override
    //@Cacheable(value="account",key="'account'+#id.toString()")
    @Cacheable(value="account")
    //@Cacheable
    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");

        return iaccountdao.findAll();
    }

    @Override
    @CachePut(value="account")
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存帐户...");
        iaccountdao.saveAccount(account);  //调用service中的saveAccount(account)方法
    }
    @Override
    @CacheEvict(value="account")
    public void deleteAccount(Account account) {
        System.out.println("Service业务层：删除帐户...");
        iaccountdao.deleteAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("Service业务层：更新帐户...");
        iaccountdao.updateAccount(account);
    }
}
