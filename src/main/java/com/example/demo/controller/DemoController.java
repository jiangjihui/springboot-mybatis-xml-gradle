package com.example.demo.controller;

import com.example.demo.mapper.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DemoController
 *
 * @author jjh
 * @date 2021/01/06
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private TestMapper testMapper;

    @GetMapping("/testdb")
    public Object testdb() {
        return testMapper.testdb();
    }

}
