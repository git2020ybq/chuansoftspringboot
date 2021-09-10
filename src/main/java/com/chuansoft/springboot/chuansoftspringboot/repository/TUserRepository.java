package com.chuansoft.springboot.chuansoftspringboot.repository;

import com.chuansoft.springboot.chuansoftspringboot.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TUserRepository extends JpaRepository<TUser,Integer> {
}
