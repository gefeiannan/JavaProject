package com.example.dameng.user.service.impl;

import com.example.dameng.dbconfig.DataSource;
import com.example.dameng.user.entity.User;
import com.example.dameng.user.mapper.UserMapper;
import com.example.dameng.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Override
    public void insert1(User user) {
        userMapper.insert(user);
    }

    @DataSource("datasource2")
    @Override
    public void insert2(User user) {
        userMapper.insert(user);
    }

    @Transactional
    @Override
    public void insertAll() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(20);

        userService.insert2(user);
        int i = 1/0;
        userService.insert1(user);
    }
}
