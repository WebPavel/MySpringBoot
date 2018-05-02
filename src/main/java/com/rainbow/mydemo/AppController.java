package com.rainbow.mydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/index")
    public String index(){
        return "hello,world";
    }
}
