package com.chuansoft.springboot.chuansoftspringboot.service;

import com.chuansoft.springboot.chuansoftspringboot.entity.Page;
import com.chuansoft.springboot.chuansoftspringboot.entity.User;

import java.util.List;

public interface IUserService {
    public int userRegister(User user);
    public List<User> browsePageUser(Page page);
}
