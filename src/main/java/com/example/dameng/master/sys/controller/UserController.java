package com.example.dameng.master.sys.controller;

import com.example.dameng.master.sys.entity.User;
import com.example.dameng.master.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> query() {
        return userService.query();
    }

    @GetMapping("{id}")
    public User queryById(@PathVariable String id) {
        return userService.queryById(Integer.parseInt(id));
    }

    @PostMapping(value = "page")
    public Page<User> queryForPage(@RequestBody Map<String, Object> parameters, @PageableDefault Pageable pageable) {
        return userService.queryForPage(parameters, pageable);
    }
}
