package com.example.dameng.system.controller;

import com.example.dameng.system.entity.Fonds;
import com.example.dameng.system.service.FondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("fonds")
@RestController
public class FondsController {
    @Autowired
    private FondsService fondsService;

    /**
     * 查找所有全宗
     *
     * @return 全宗列表
     */
    @GetMapping("datasource1")
    public List<Fonds> findAll() {
        return fondsService.findAll();
    }

    @GetMapping("datasource2")
    public List<Fonds> findAll1() {
        return fondsService.findAll1();
    }

    /**
     * 查找全宗
     *
     * @param id 主键
     * @return 全宗
     */
    @GetMapping("{id}")
    public Fonds findById(@PathVariable String id) {
        return fondsService.findById(id);
    }
}
