package com.example.demo.controller;

import com.example.demo.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class TestController {

    @Value("${demo.test}")
    String str;

    @Autowired
    Person person;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String Test(@Valid Person person) throws Exception {
//        Person person = new Person();
//        person.setAge(13);
//        person.setName("战三国杀");
//        System.out.println(person.getHobby().get(1));

//        //数组越界异常测试
//        int[] a = new int[3];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        a[3] = 4;

//        //算数异常测试
//        int i = 3 / 0;



        log.info(str);
        log.warn(str);
        return person.toString();
    }
}
