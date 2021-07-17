package com.project.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.domain.Account;
import com.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@Async//通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
public class AccountController {

    @Autowired   //按类型注入
    private AccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(@RequestParam(name = "page", defaultValue = "1") Integer page, Model model) {  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        PageHelper.startPage(page, 3);//每页条数=3
        // 调用service的方法
        List<Account> list = accountService.findAll();


        //查看一下是否查到了数据
        for (Account user : list) {
            System.out.println("=========" + user);
        }
        /**
         * pageNum:当前页
         * pageSize:每页的数量
         * size:当前页的数量
         * pages:总页数
         * total:总记录数
         */

        /**
         *  PageInfo就是当初那个分页工具类(分页bean)
         */
        PageInfo<Account> pageInfo = new PageInfo<Account>(list);//把数据放在分页类中
        //封装数据
        //传分页类
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("list1", list);
        return "list";

    }

    @RequestMapping("/account/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

    @RequestMapping("/account/delete")
    public void delete(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        System.out.println("Controller表现层：删除账户...");
        accountService.deleteAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

    @RequestMapping("/account/update")
    public void update(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        System.out.println("Controller表现层：更新账户...");
        accountService.updateAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

}
