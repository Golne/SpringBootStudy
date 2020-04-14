package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis-Plus配置文件，使其加载配置文件
 */
//@EnableTransactionManagement
//@MapperScan("com.example.demo.dao")
@Configuration
@ImportResource(locations = {"classpath:/spring-mybatis.xml"})
public class MybatisPlusConfig {
}
