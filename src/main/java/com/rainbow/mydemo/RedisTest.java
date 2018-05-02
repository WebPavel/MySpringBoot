package com.rainbow.mydemo;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class RedisTest {
    private static Logger log = Logger.getLogger(RedisTest.class);
    public static void main(String[] args) {
        log.info("log4j...stdout");
        //连接本地的redis服务
        Jedis jedis=new Jedis("localhost");
        System.out.println("连接成功");
        //设置redis字符串数据
        jedis.set("uid","1");
        System.out.println(jedis.get("uid"));
        jedis.lpush("site-list","baidu");
        jedis.lpush("site-list","google");
        jedis.lpush("site-list","taobao");
        List<String> list=jedis.lrange("site-list",0,-1);
        System.out.println("list "+JSON.toJSONString(list));
        for (String item:list){
            System.out.println(item);
        }
        Set keys=jedis.keys("*");
        System.out.println(JSON.toJSONString(keys));
    }

    @Test
    public void test(){
        log.info("assdadasd");
    }
}
