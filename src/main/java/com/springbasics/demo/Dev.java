package com.springbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop") //provide the auto created obj name
    private Computer computer;

    public void start(){
        System.out.println("I am dev");
        computer.type();
    }

}
