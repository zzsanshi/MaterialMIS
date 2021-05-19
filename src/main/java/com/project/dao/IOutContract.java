package com.project.dao;

import com.project.domain.Account;
import com.project.domain.InContract;
import com.project.domain.OutContract;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOutContract {

    @Select("select * from busi_out_contract")
    public List<OutContract> findAll();

//    @Insert("insert into busi_in_contract(NAME,) value(#{name},#{money})")
//    public void saveAccount(Account account);

}
