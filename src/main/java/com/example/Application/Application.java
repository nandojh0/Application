package com.example.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("MYSQL_HOSTNAME: " + System.getenv("MYSQL_HOSTNAME"));
        System.out.println("MYSQL_PORT: " + System.getenv("MYSQL_PORT"));
        System.out.println("MYSQL_DATABASE: " + System.getenv("MYSQL_DATABASE"));
        System.out.println("MYSQL_USERNAME: " + System.getenv("MYSQL_USERNAME"));
        System.out.println("MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD"));
        SpringApplication.run(Application.class, args);
    }

}
