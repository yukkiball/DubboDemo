package com.yuki.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */

@EnableDubboConfig
@SpringBootApplication
@ImportResource({"classpath:consumer.xml"})
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}