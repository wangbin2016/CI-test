package com.ci.demo;

import com.ci.demo.controller.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    AddService addService;

    @Test
    void addTest(){
        int add = addService.add(1, 6);
        assert add == 7;
    }

}
