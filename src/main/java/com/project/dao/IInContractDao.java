package com.project.dao;

import com.project.domain.Account;
import com.project.domain.InContract;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //此注解代表这是一个持久层，用法类似@controller、@service
public interface IInContractDao {
    @Select("select * from busi_in_contract")
    public List<InContract> findAll();

//    @Insert("insert into busi_in_contract(NAME,) value(#{name},#{money})")
//    public void saveAccount(Account account);

}
