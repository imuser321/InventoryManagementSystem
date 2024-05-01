package com.davi.shop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShopApplication {

    public ShopApplication() {
        System.err.println("ShopApplication");
    }

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }
}


