package com.qianshan.service.impl;

import com.alibaba.fastjson.JSON;
import com.qianshan.modal.User;
import com.qianshan.service.UserService;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(long userId) {
        System.out.println(userId);
        User user = new User();
        user.setUserId(System.currentTimeMillis());
        user.setUserNmae(String.valueOf(System.currentTimeMillis()));
        System.out.println(JSON.toJSONString(user));
        System.out.println("开始时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
        return user;
    }

    @Override
    public void updateUser(User user) {
        System.out.println("开始时间：updateUser"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));

    }

    @Override
    public void deleteUser(long userId) {
        System.out.println("开始时间：updateUser"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
    }

}
