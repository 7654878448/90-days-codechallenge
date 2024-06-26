package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.configurations;

public class launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ano = new AnnotationConfigApplicationContext(configurations.class);
        google gog = ano.getBean(google.class);
        System.out.println(gog);
        ano.close();
    }
}
