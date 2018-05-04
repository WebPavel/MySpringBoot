package com.rainbow.mydemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReadController {

    @RequestMapping("/read")
    public String index(ModelMap map){
        //加入一个属性，用于在模板中读取
        map.addAttribute("host","http://lb.yupaopao.cn");
        return "index";
    }
}
