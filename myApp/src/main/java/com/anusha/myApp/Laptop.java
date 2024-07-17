package com.anusha.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling with 402 bugs");
    }
}
