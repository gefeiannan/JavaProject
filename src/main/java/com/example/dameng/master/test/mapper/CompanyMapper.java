package com.example.dameng.master.test.mapper;

import com.example.dameng.master.test.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {
    List<Company> query();

    Company queryById(int id);
}
