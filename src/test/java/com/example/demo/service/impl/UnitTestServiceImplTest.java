package com.example.demo.service.impl;

import com.example.demo.service.UnitTestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//SpringBootTest 是springboot 用于测试的注解，可指定启动类或者测试环境等
@SpringBootTest
public class UnitTestServiceImplTest {

    @Autowired
    UnitTestService testService;

    @Test
    public void test() {
        String msg = "this is a test";
        String result = testService.process(msg);
        Assert.assertEquals(msg, result);
    }
}
