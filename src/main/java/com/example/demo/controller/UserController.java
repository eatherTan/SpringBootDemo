package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    @ApiOperation(value = "查询用户接口", httpMethod = "GET")
    public User testQuery() {
        return userService.selectUserByName("tan");
    }
}