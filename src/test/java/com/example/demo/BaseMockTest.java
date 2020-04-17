package com.example.demo;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * mock 基类
 */
public abstract class BaseMockTest {

    @Autowired
    private WebApplicationContext wc;

    protected MockMvc mockMvc;

    @Before
    public void beforeSetUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
    }

}
