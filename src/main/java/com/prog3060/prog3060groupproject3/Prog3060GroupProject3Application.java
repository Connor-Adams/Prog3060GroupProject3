package com.prog3060.prog3060groupproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Prog3060GroupProject3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Prog3060GroupProject3Application.class, args);

        HRManagerService hrManagerService = (HRManagerService) ctx.getBean("HRService");

        System.out.println("Starting test");
        hrManagerService.test();
        System.out.println("Test Complete");
    }

}
