package com.chuansoft.springboot.chuansoftspringboot.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MyConfig {

    @Bean
    public PageHelper pageHelper(){
        PageHelper ph=new PageHelper();
        Properties prop=new Properties();
        prop.setProperty("dialect","mysql");
        prop.setProperty("reasonable","true");
        return ph;
    }
}
