package com.springboot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@ControllerAdvice
@Slf4j
public class UserController {
    @ExceptionHandler(RuntimeException.class)
    public String exceptionHandler(Exception e) {
        log.info("-----------------> exception occurred ");
        System.out.println("exception occur :" + e);
        return "Seems some problems occurred in the system -_-:" + e;
    }

    @RequestMapping("hello")
    public String hello() {
        int i = 1/0;
        return "hello";
    }

    @RequestMapping("bye")
    public String bye() {
        return "bye bye ?_?";
    }
}
