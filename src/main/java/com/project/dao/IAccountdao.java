package com.project.dao;

import com.project.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //此注解代表这是一个持久层，用法类似@controller、@service
public interface IAccountdao {

    @Select("select * from base_user")
    public List<Account> findAll();

    @Insert("insert into base_user (name,password) value(#{name},#{password})")
    public void saveAccount(Account account);

    @Delete("delete from base_user where id = #{id}")
    public void deleteAccount(Account account);

    @Update("update base_user set password=#{password} where id = #{id}")
    public void updateAccount(Account account);
}
