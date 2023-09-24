package com.czy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class test {
    public static void main(String[] args) {
        SpringApplication.run(test.class,args);
        System.out.println("------------redis的demo启动成功----------------");
    }
}