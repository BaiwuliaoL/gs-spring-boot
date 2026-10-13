package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 把这个类标记为 “返回 JSON/文本 的 Web 控制器，等同于 @Controller + @ResponseBody
@RestController
public class HelloController {

  // 浏览器访问根路径时，调用下面的方法
  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}
