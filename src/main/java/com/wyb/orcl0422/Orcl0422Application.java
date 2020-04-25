package com.wyb.orcl0422;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.wyb.orcl0422.dao")
@EnableScheduling
@SpringBootApplication
public class Orcl0422Application {

    public static void main(String[] args) {
        SpringApplication.run(Orcl0422Application.class, args);
    }

}
