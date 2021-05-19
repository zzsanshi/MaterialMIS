package com.project.service;

import com.project.domain.InContract;
import com.project.domain.OutContract;

import java.util.List;

public interface InContractService {

    // 查询所有出库表
    public List<InContract> findAll();
}
