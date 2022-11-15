package com.crudoperation.sqldatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SqldatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqldatabaseApplication.class, args);
    }

}
