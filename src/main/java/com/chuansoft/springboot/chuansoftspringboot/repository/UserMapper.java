package com.chuansoft.springboot.chuansoftspringboot.repository;

import com.chuansoft.springboot.chuansoftspringboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface UserMapper {
    //插入用户
    @Insert("insert into my_user(name,age,birthday,sex)"
            + " values(#{name},#{age},#{birthday},#{sex})")
    @Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
    public int insertUserGetKey(User user);
    public List<User> findUserByPage();
}
