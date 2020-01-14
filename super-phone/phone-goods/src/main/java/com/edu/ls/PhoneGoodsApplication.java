package com.edu.ls;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.edu.ls.service.impl"})
public class PhoneGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneGoodsApplication.class, args);
    }

}
