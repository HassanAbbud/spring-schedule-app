package com.hassan.springboot.calendar.interceptor.springboot_schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hassan.springboot.calendar.interceptor.springboot_schedule.interceptors.CalendarInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Autowired
    @Qualifier("calendarInterceptor")
    private CalendarInterceptor calendarInterceptor;

    //add the interceptor to all routes
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(calendarInterceptor);
        //.add/excludePathPatterns delimits the paths that will be affected by the interceptor
    }
    
}
