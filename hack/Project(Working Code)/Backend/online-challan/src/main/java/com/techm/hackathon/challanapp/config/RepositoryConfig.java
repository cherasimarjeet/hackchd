package com.techm.hackathon.challanapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.techm.hackathon.challanapp.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.techm.hackathon.challanapp.domain"})
public class RepositoryConfig {
}
