package com.project.controller;

import com.project.domain.InContract;
import com.project.domain.OutContract;
import com.project.service.InContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InContractController {
    @Autowired
    private InContractService inContractService;

    @RequestMapping("/inAContract/findAll")
    public String findAll(Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<InContract> list = inContractService.findAll();
        model.addAttribute("list3",list);
        return "list3";
    }

}
