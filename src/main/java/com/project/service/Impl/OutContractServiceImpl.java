package com.project.service.Impl;

import com.project.dao.IOutContract;
import com.project.domain.OutContract;
import com.project.service.OutContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("outAccountService'")
public class OutContractServiceImpl implements OutContractService {
    @Autowired
    IOutContract iOutContract;


    @Override
    public List<OutContract> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iOutContract.findAll();
    }


}
