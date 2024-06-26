package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private int accnumber;
    private String bankname;

    public Account() {
        System.out.println("Account Object is Created");
    }

    @Override
    public String toString() {
        return "Account [accnumber=" + accnumber + ", bankname=" + bankname + "]";
    }
}
