package com.anusha.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired // Field injection
    @Qualifier("computer") // class name in small letter
    private Computer comp;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
//    @Autowired //setter injection
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Working on awsome project");
    }

}
