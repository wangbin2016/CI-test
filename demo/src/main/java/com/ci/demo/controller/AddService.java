package com.ci.demo.controller;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int add(int a, int b) {
        return a + b;
    }
}
