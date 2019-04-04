package com.example.dameng.master.test.service;

import com.example.dameng.master.test.entity.Company;

import java.util.List;

public interface CompanyService {
    List<Company> query();

    Company queryById(int id);
}
