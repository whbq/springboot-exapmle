package com.qianshan.controller;

import com.qianshan.modal.User;
import com.qianshan.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userServiceImpl;

    @GetMapping("getUserById/{userId}")
    User getUserById(@PathVariable(value = "userId", required = true) long userId) {
        return userServiceImpl.getUserById(userId);
    }

    @GetMapping("updateUser")
    User updateUser() {
        User user = new User();
        user.setUserId(1L);
        user.setUserNmae("test");
        userServiceImpl.updateUser(user);
        return userServiceImpl.getUserById(1);
    }

    @GetMapping("deleteUser")
    User deleteUser() {
        User user = new User();
        user.setUserId(1L);
        userServiceImpl.deleteUser(1);
        return userServiceImpl.getUserById(1);
    }
}
