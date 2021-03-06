package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//@PropertySource(value = {"classpath:my.properties","classpath:person.properties"},encoding = "UTF-8")
@SpringBootApplication
@ServletComponentScan
@PropertySources({@PropertySource(value = "classpath:my.properties", encoding = "UTF-8"), @PropertySource(value = "classpath:person.properties", encoding = "UTF-8")})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
