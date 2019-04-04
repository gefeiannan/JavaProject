package com.example.dameng.master.test.controller;

import com.example.dameng.master.test.entity.Company;
import com.example.dameng.master.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("company")
@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> query() {
        return companyService.query();
    }

    @GetMapping("{id}")
    public Company queryById(@PathVariable String id) {
        return companyService.queryById(Integer.parseInt(id));
    }
}
