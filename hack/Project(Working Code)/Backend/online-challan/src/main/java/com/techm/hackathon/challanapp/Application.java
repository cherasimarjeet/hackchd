package com.techm.hackathon.challanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import com.techm.hackathon.challanapp.config.AppConfig;
import com.techm.hackathon.challanapp.server.ServletContainerCustomizer;

@Configuration
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{AppConfig.class, ServletContainerCustomizer.class}, args);
    }
}
