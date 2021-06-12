package com.project.controller;

import com.project.domain.Account;
import com.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String findAll(Model model) {  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
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
