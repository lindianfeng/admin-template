package com.freejoy.giftcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.freejoy.giftcode.mapper")
public class GiftCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(GiftCodeApplication.class, args);
    }
}


