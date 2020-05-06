package com.yeaho.newborn.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : yeaho_lee
 * @Description : 启动类
 * @createTime : 2020年05月06日 14:21
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.yeaho.newborn")
public class NewBornApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewBornApplication.class);
    }
}
