package com.project.service.Impl;

import com.project.dao.IInContractDao;
import com.project.dao.IOutContract;
import com.project.domain.InContract;
import com.project.service.InContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
public class InContractServiceImpl implements InContractService {

    @Autowired
    IInContractDao iInContractDao;

    @Override
    //@Async
    @Cacheable(value="InContract",key="'InContract'")
    public List<InContract> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iInContractDao.findAll();
    }
}
