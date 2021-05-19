package com.project.service;

import com.project.domain.Account;
import com.project.domain.OutContract;

import java.util.List;

public interface OutContractService {

    // 查询所有出库表
    public List<OutContract> findAll();
}
