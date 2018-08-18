package com.springboot.data.controller;

import com.springboot.data.bean.User;
import com.springboot.data.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController//将响应客户端的数据转换成json数据格式
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/{id}")//resrful风格的请求方式
    public Optional<User> getUserById(@PathVariable("id") Integer id){

        Optional<User> user = userDao.findById(id);

        return user;
    }
}
