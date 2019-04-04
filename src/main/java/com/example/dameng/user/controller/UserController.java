package com.example.dameng.user.controller;

import com.example.dameng.user.entity.User;
import com.example.dameng.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public void save() {
        userService.insertAll();
    }

    @GetMapping("save1")
    public void save1() {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        userService.insert1(user);
        userService.insert2(user);
    }
}
