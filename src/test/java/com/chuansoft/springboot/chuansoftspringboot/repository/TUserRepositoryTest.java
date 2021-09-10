package com.chuansoft.springboot.chuansoftspringboot.repository;


import com.chuansoft.springboot.chuansoftspringboot.ChuansoftspringbootApplication;
import com.chuansoft.springboot.chuansoftspringboot.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ChuansoftspringbootApplication.class)
public class TUserRepositoryTest {
    @Autowired
    private TUserRepository tUserRepository;

    @Test
    public void testSave(){
        TUser user=new TUser();
        user.setUsername("王云");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setCode("5452");
        user.setPhone("13982234522");
        tUserRepository.save(user);
    }
}