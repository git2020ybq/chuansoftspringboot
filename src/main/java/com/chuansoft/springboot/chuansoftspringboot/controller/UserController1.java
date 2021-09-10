package com.chuansoft.springboot.chuansoftspringboot.controller;

import com.chuansoft.springboot.chuansoftspringboot.entity.Page;
import com.chuansoft.springboot.chuansoftspringboot.entity.User;
import com.chuansoft.springboot.chuansoftspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController1 {
    @Autowired
    private IUserService userService;

    @RequestMapping("/userRegisterGetKey")
    @ResponseBody
    public String userRegisterGetKey(User user){
        int rows=userService.userRegister(user);
        System.out.println("插入后的用户数据:");
        System.out.println(user);
        return "插入数据:["+rows+"]条";
    }

    @RequestMapping("/browsePageUser")
    public String browsePageUser(Page page, Model model){
        if(page.getPage()==0){
            page.setPage(1);
            page.setPageSize(2);
        }
        List<User> users=userService.browsePageUser(page);
        model.addAttribute("users", users);
        model.addAttribute("page", page);
        return "userList";
    }
}

