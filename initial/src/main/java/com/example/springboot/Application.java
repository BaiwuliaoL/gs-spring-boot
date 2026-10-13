package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication 注解 = 三个能力：自动配置、组件扫描、开启 Spring Boot 本身
@SpringBootApplication
public class Application {

  public static void main(String[] args) {

    // SpringApplication.run：启动整个应用，返回的 ctx 是 Spring 容器
    ApplicationContext ctx = SpringApplication.run(Application.class, args);

    System.out.println("Let's inspect the beans provided by Spring Boot:");

    // ctx.getBeanDefinitionNames():拿到容器里所有的 Bean 名字并打印
    String[] beanNames = ctx.getBeanDefinitionNames();

    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
  }
  
}
