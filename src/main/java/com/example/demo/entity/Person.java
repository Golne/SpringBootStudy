package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    @NotNull
    String name;

    @Max(99)
    int age;

    List<String> hobby;
}
