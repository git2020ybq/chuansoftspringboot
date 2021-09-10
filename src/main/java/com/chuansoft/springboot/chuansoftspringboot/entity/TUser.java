package com.chuansoft.springboot.chuansoftspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Data
@ToString
@Entity
@Table(name="tuser")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="sex")
    private String sex;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="code")
    private String code;
    @Column(name="state")
    private String state;
}
