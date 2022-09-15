package com.example.timing01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling   // 用来开启定时任务功能，可以检测 Spring 管理的 bean 上 @Scheduled 的注解，系统默认会自动启动一个线程，来调度执行定时任务。
@MapperScan("com.example.timing01.dao")
public class Timing01Application {

    public static void main(String[] args) {
        SpringApplication.run(Timing01Application.class, args);
    }

}
