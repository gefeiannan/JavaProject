package com.example.dameng.system.service;

import com.example.dameng.dbconfig.DataSource;
import com.example.dameng.system.entity.Fonds;

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

    List<Fonds> findAll1();
}
