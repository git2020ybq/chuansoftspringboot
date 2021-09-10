package com.chuansoft.springboot.chuansoftspringboot.datasource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {

    @Autowired
    private ApplicationContext ac;

    @Autowired
    private DataSourceProperties dsp;

    @Test
    public void testDataSource() throws Exception {
        DataSource ds=(DataSource)ac.getBean(DataSource.class);
        System.out.println(ds==null);
        System.out.println(ds.getClass().getName());
        System.out.println(dsp.getUrl());
        System.out.println(dsp.getDriverClassName());
    }
}