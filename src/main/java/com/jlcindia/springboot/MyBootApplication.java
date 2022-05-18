package com.jlcindia.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
public static void main(String[] args) {
System.out.println("Starting Boot Application");
System.out.println("Update -1 Srinivas");
  System.out.println("Update -2 by Srinivas");

SpringApplication.run(MyBootApplication.class, args);
}
}
