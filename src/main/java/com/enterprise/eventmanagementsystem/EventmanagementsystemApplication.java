package com.enterprise.eventmanagementsystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
public class EventmanagementsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventmanagementsystemApplication.class, args);
    }

}
