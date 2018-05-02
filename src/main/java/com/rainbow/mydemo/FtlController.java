package com.rainbow.mydemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FtlController {
    @RequestMapping("/ftl")
    public String fltIndex(ModelMap map){
        map.addAttribute("username","liubao");
        return "index2";
    }
}
