package com.example.spring_borisov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.spring_borisov.empty"})
public class SpringBorisovApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBorisovApplication.class, args);
    }

}