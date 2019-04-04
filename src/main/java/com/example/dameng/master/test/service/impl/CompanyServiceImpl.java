package com.example.dameng.master.test.service.impl;

import com.example.dameng.master.test.entity.Company;
import com.example.dameng.master.test.mapper.CompanyMapper;
import com.example.dameng.master.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> query() {
        return companyMapper.query();
    }

    @Override
    public Company queryById(int id) {
        return companyMapper.queryById(id);
    }
}
