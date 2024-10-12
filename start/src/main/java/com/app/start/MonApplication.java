package com.app.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.app.start", "com.app.library", "com.app.statistic"})
@EntityScan(basePackages = {"com.app.library.entity", "com.app.statistic.entity"})
@EnableJpaRepositories(basePackages = {"com.app.library.repository", "com.app.statistic.repository"})
public class MonApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonApplication.class, args);
    }
}