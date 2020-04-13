package com.example.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("respCode","00");
        result.put("respMsg",e.getMessage());
        return result;
    }
//    @ResponseBody
//    @ExceptionHandler(ArithmeticException.class)
//    public Map<String,Object> arithmeticExceptionHandler(ArithmeticException e){
//        Map<String, Object> result = new HashMap<String,Object>();
//        result.put("respCode","8888");
//        result.put("respMsg","算数异常");
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//    public Map<String,Object> nullPointerExceptionHandler(ArrayIndexOutOfBoundsException e){
//        Map<String, Object> result = new HashMap<String,Object>();
//        result.put("respCode","9999");
//        result.put("respMsg","数组越界异常");
//        return result;
//    }
}
