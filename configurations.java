package com.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.Account;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class configurations {
    @Autowired
    private Account acc;
    
    @Autowired
    public configurations(Account acc) {
    	
		super();
		System.out.println("this is Consturctor injection");
		this.acc = acc;
	}

	@Autowired
    public void setAcc(Account acc) {
    	System.out.println("setter injection");
		this.acc = acc;
	}

	@Bean
    public ArrayList<String> getlist() {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        return al;
    }

    @Bean
    public ArrayList<Account> getAcc() {
        ArrayList<Account> al = new ArrayList<>();
        al.add(acc);
        al.add(acc);
        return al;
    }
}
