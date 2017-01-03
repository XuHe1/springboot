//package com.kyx.app.web.servlet;
//
//import com.kyx.app.web.filter.SessionFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by kaiitsugyou on 16/12/30.
// */
//@Configuration
//@ServletComponentScan
//public class MyConf {
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        SessionFilter sessionFilter = new SessionFilter();
//        return new FilterRegistrationBean(sessionFilter);
//    }
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        return new ServletRegistrationBean(new MyServlet(),"/myServlet");
//    }
//
//}
