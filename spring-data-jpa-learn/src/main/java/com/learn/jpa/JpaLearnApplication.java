package com.learn.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaLearnApplication.class, args);
    }

}
