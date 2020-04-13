package com.example.demo.config;

import com.example.demo.filter.AFilter;
import com.example.demo.filter.BFilter;
import com.example.demo.filter.CFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean bfilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(getBFilter());
        registration.setName("bFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
    @Bean
    public FilterRegistrationBean afilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(getAFilter());
        registration.setName("aFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(2);
        return registration;
    }
    @Bean
    public FilterRegistrationBean cfilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(getCFilter());
        registration.setName("cFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(3);
        return registration;
    }

    @Bean
    public CFilter getCFilter(){
        return new CFilter();
    }
    @Bean
    public AFilter getAFilter(){
        return new AFilter();
    }
    @Bean
    public static BFilter getBFilter(){
        return new BFilter();
    }
}
