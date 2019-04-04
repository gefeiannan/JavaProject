package com.example.dameng.master.sys.service.impl;

import com.example.dameng.master.sys.entity.User;
import com.example.dameng.master.sys.mapper.UserMapper;
import com.example.dameng.master.sys.service.UserService;
import com.example.dameng.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    /**
     * 分页查询用户
     *
     * @param params   查询参数
     * @param pageable 分页请求对象
     * @return 分页结果对象
     */
    @Override
    public Page<User> queryForPage(Map<String, Object> params, Pageable pageable) {
        // 操作人
//        if (!StringUtils.isEmpty(params.get("username"))) {
//            BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
//            queryBuilder.must(QueryBuilders.matchQuery("username", params.get("username")));
//            SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                    .withIndices("user")
//                    .withTypes("user")
//                    .withFilter(queryBuilder)
//                    .withPageable(pageable)
//                    .build();
//            Page<User> page = elasticsearchTemplate.queryForPage(searchQuery, User.class);
//            return new PageImpl<>(page.getContent(), pageable, page.getTotalElements());
//        }
        return PageUtils.startPage(pageable, () -> userMapper.queryForList(params));
    }
}
