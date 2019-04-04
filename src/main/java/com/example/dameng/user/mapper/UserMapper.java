package com.example.dameng.user.mapper;

import com.example.dameng.dbconfig.DataSource;
import com.example.dameng.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insert(User user);
}
