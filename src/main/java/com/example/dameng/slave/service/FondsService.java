package com.example.dameng.slave.service;

import com.example.dameng.slave.entity.Fonds;

import java.util.List;

public interface FondsService {
    /**
     * 查找全宗
     *
     * @param id 主键
     * @return 全宗
     */
    Fonds findById(String id);

    /**
     * 查找全宗
     *
     * @param fondscode 全宗名
     * @return 全宗
     */
    Fonds findByFondscode(String fondscode);

    /**
     * 查询全宗列表
     *
     * @return 全宗列表
     */
    List<Fonds> findAll();
}
