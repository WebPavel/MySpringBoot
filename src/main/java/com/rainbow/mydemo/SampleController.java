package com.rainbow.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hi,jack";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public User visit(){
        User user=new User();
        user.setUid(1);
        user.setUname("liu");
        user.setBirthday(new Date());
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
