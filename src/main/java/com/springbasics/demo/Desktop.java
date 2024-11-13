package com.springbasics.demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void type(){
        System.out.println("Using the Desktop");
    }
}
