package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitController {
    @RequestMapping(value = "/mock", method = RequestMethod.GET)
    public String test(String msg) {
        return msg;
    }
}
