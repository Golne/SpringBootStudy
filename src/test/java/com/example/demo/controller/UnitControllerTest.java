package com.example.demo.controller;

import com.example.demo.BaseMockTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//SpringBootTest 是springboot 用于测试的注解，可指定启动类或者测试环境等
//因为是mock测试，在实际开发过程中，可指定其测试启动时为随机端口，避免了不必要的端口冲突
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//测试单一接口时 ，也可利用注解@WebMvcTest 进行单一测试
//@WebMvcTest(UnitController.class)
public class UnitControllerTest extends BaseMockTest {

    @Test
    public void testDemo() throws Exception {
        String msg = "this is a mock test";
        //设置了 print() 会打印相关参数信息
        MvcResult result = this.mockMvc.perform(get("/mock").param("msg", msg)).andDo(print()).andExpect(status().isOk()).andReturn();

        //断言 是否和预期相等
        Assert.assertEquals(msg, result.getResponse().getContentAsString());

    }
}
