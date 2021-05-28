package com.project.controller;

import com.project.domain.OutContract;
import com.project.service.OutContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@Async//通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
public class OutContractController {

    @Autowired
   private OutContractService outContractService;

    @RequestMapping("/outAContract/findAll")
    public String findAll(Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<OutContract> list = outContractService.findAll();
        model.addAttribute("list2",list);
        return "list2";
    }
}
