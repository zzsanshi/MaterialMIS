package com.project.service.Impl;

import com.project.dao.IInContractDao;
import com.project.dao.IOutContract;
import com.project.domain.InContract;
import com.project.service.InContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InContractServiceImpl implements InContractService {

    @Autowired
    IInContractDao iInContractDao;

    @Override
    public List<InContract> findAll() {

        return iInContractDao.findAll();
    }
}
