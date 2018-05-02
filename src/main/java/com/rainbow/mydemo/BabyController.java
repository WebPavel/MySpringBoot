package com.rainbow.mydemo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/babys")
public class BabyController {
    //创建线程安全的Map
    static Map<Long,Baby> babys= Collections.synchronizedMap(new HashMap<Long,Baby>());

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Baby> getBabyList(){
        //处理"/users/"的GET请求，用来获取用户列表
        List<Baby> babyList=new ArrayList<Baby>(babys.values());
        return babyList;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String postUser(@ModelAttribute Baby baby){
        // 处理"/users/"的POST请求，创建Baby
        //除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        babys.put(baby.getId(),baby);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Baby getBaby(@PathVariable Long id){
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return babys.get(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putBaby(@PathVariable Long id,@ModelAttribute Baby baby){//此处注意baby类必须有构造方法，否则请求失败
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        Baby b=babys.get(id);
        b.setName(baby.getName());
        b.setAge(baby.getAge());
        babys.put(id,b);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteBaby(@PathVariable Long id){
        babys.remove(id);
        return "success";
    }
}
