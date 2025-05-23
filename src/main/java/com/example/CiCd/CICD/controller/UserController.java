package com.example.CiCd.CICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World2!";
    }

    @GetMapping("/{id}")
    public String hello2(@PathVariable  String id) {
        return "Hello,"+ id;

    }
}
