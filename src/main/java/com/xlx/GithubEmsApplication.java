package com.xlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication

@MapperScan("com.xlx.dao")
public class GithubEmsApplication {
    //这是一个入口类
    public static void main(String[] args) {
        System.out.println("博哥走的第一个半月，想他");
        SpringApplication.run(GithubEmsApplication.class, args);
    }
}
