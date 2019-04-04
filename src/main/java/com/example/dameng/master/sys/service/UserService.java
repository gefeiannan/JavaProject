package com.example.dameng.master.sys.service;

import com.example.dameng.master.sys.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> query();

    User queryById(int id);

    /**
     * 分页查询用户
     *
     * @param params   查询参数
     * @param pageable 分页请求对象
     * @return 分页结果对象
     */
    Page<User> queryForPage(Map<String, Object> params, Pageable pageable);
}
