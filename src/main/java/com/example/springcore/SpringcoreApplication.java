package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.example.springcore", "com.example.utils"})


@SpringBootApplication
public class SpringcoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoreApplication.class, args);
    }

}
