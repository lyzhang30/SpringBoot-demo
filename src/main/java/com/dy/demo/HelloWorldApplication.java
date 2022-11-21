package com.dy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhanglianyong
 * 2022/11/21 9:07
 * @EnableTransactionManagement 把事务交给Spring管理
 * @SpringBootApplication SpringBoot启动类的注解
 * @MapperScan  扫描组件
 */
@SpringBootApplication
@MapperScan(basePackages = "com.dy.demo.mapper")
@EnableTransactionManagement
public class HelloWorldApplication {
    public static void main(String[] args){
        // 启动类
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
