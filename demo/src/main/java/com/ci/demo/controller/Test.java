package com.ci.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    AddService addService;

    @RequestMapping("/add")
    public int add(@RequestParam("a") int a,@RequestParam("b") int b) {
        return addService.add(a, b);
    }
}
