package com.project.controller;

import com.project.domain.OutContract;
import com.project.service.OutContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
