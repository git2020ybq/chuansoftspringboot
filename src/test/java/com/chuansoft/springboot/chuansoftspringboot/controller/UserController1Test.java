package com.chuansoft.springboot.chuansoftspringboot.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserController1Test {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserRegister() throws Exception {
        MultiValueMap<String,String> map=new LinkedMultiValueMap<>();
        map.add("name","王五");
        map.add("age", 32+"");
        map.add("birthday",new Date()+"");
        map.add("sex","男");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/user/userRegisterGetKey")
                .params(map))// 参数
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}