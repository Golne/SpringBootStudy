package com.example.demo.service.impl;

import com.example.demo.service.UnitTestService;
import org.springframework.stereotype.Service;

@Service
public class UnitTestServiceImpl implements UnitTestService {

    @Override
    public String process(String msg) {
        //直接返回传入值
        return msg;
    }
}
