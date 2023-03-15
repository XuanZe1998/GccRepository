package com.tzp.materials.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description helloword
 * @author gcc
 * Date 2023/3/15 22:31
 */
@RequestMapping("/api")
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "呆子，写论文";
    }
}
