package com.chuansoft.springboot.chuansoftspringboot.service;

import com.chuansoft.springboot.chuansoftspringboot.entity.Page;
import com.chuansoft.springboot.chuansoftspringboot.entity.User;
import com.chuansoft.springboot.chuansoftspringboot.repository.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PageHelper ph;

    @Override
    @Transactional(rollbackFor={Exception.class})
    public int userRegister(User user) {
        return userMapper.insertUserGetKey(user);
    }

    @Override
    public List<User> browsePageUser(Page page) {
        ph.startPage(page.getPage(),page.getPageSize());
        return userMapper.findUserByPage();
    }
}
