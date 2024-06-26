package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class google {
    @Value("345")
    private int age;

    @Value("Sumit Sehgal")
    private String name;

    @Value("#{getlist}")
    private List<String> list;

    @Value("#{getAcc}")
    private List<Account> acc;

    public google() {
        System.out.println("google Object is created");
    }

    @Override
    public String toString() {
        return "google [age=" + age + ", name=" + name + ", list=" + list + ", acc=" + acc + "]";
    }
}
