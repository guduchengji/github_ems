package com.xlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xlx.dao")//补充了入口类
public class GithubEmsApplication {
    //这是一个入口类
    public static void main(String[] args) {
        System.out.println("真男人就该干变形金刚");
        SpringApplication.run(GithubEmsApplication.class, args);
    }

}
