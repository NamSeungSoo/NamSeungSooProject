package com.nam.join.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nam")
public class JoinApplication {

   public static void main(String[] args){
       SpringApplication.run(JoinApplication.class, args);
   }
}
