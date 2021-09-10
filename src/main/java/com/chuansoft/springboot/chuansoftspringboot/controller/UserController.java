package com.chuansoft.springboot.chuansoftspringboot.controller;

import com.chuansoft.springboot.chuansoftspringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JdbcTemplate jd;

    //返回POJO
    @RequestMapping("/findUser")
    public User findUser(){
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(22);
        user.setBirthday(new Date());
        user.setSex("男");
        return user;
    }

    //返回集合List
    @RequestMapping("/findUserList")
    public List<User> findUserList(){
        List<User> users=new ArrayList<>();
        for(int i=0;i<5;i++){
            User user=new User();
            user.setId(100+i);
            user.setName("名字"+i);
            user.setAge(20+i);
            user.setBirthday(new Date());
            if(i%2==0)user.setSex("男");
            else user.setSex("女");
            users.add(user);
        }
        return users;
    }
    //返回map
    @RequestMapping("/findUserMap")
    public Map findUserMap(){
        Map usermap=new HashMap();;
        usermap.put("id", 2);
        usermap.put("name","lisi");
        usermap.put("age", 25);
        usermap.put("birthday", new Date());
        usermap.put("sex","女");
        return usermap;
    }

    @RequestMapping("/getAllUser")
    public List<Map<String,Object>> getAllUser(){
        List<Map<String,Object>> users=jd.queryForList("select * from my_user");
        return users;
    }
}

