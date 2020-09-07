package com.dj.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class Controller {

    @RequestMapping("aa")
    public String aa() {
        return "hello!";
    }
}
