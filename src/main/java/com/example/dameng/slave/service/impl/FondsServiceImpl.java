package com.example.dameng.slave.service.impl;

import com.example.dameng.slave.entity.Fonds;
import com.example.dameng.slave.mapper.FondsMapper;
import com.example.dameng.slave.service.FondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondsServiceImpl implements FondsService {
    @Autowired
    private FondsMapper fondsMapper;

    @Override
    public Fonds findById(String id) {
        return fondsMapper.findById(id);
    }

    @Override
    public Fonds findByFondscode(String fondscode) {
        return fondsMapper.findByFondscode(fondscode);
    }

    @Override
    public List<Fonds> findAll() {
        return fondsMapper.findAll();
    }
}
