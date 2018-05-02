package com.rainbow.mydemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogPropertiesTests {
    @Autowired
    private BlogProperties blogProperties;
    @Test
    public void getHello(){
        Assert.assertEquals(blogProperties.getName(), "liubao");
        Assert.assertEquals(blogProperties.getTitle(), "Spring boot");
        System.out.println(blogProperties.getDesc());
        System.out.println(blogProperties.getValue());
        System.out.println(blogProperties.getNumber());
        System.out.println(blogProperties.getBignumber());
        System.out.println(blogProperties.getRandom10());
        System.out.println(blogProperties.getRandomNum());
    }
}
