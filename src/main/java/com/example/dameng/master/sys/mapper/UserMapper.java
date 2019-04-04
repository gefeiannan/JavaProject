package com.example.dameng.master.sys.mapper;

import com.example.dameng.master.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    List<User> query();

    User queryById(int id);

    /**
     * 查询用户列表
     *
     * @param parameters 查询参数
     * @return 用户列表
     */
    List<User> queryForList(Map<String, Object> parameters);
}
