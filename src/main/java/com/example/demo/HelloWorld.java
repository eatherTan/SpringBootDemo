package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@EnableAutoConfiguration
@EnableSwagger2
//@SpringBootApplication
//@ComponentScan("com.example.demo")
public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    @ApiOperation(value = "测试1",httpMethod = "GET")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    @ApiOperation(value = "测试2",httpMethod = "GET")
    String home1() {
        return "Hello World! Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}