package com.rainbow.mydemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("${com.rainbow.blog.name}")
    private String name;

    @Value("${com.rainbow.blog.title}")
    private String title;

    @Value("${com.rainbow.blog.desc}")
    private String desc;

    @Value("${com.rainbow.blog.value}")
    private String value;

    @Value("${com.rainbow.blog.number}")
    private Integer number;

    @Value("${com.rainbow.blog.bignumber}")
    private Long bignumber;

    @Value("${com.rainbow.blog.random10}")
    private Integer random10;

    @Value("${com.rainbow.blog.randomNum}")
    private Integer randomNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getRandom10() {
        return random10;
    }

    public void setRandom10(Integer random10) {
        this.random10 = random10;
    }

    public Integer getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(Integer randomNum) {
        this.randomNum = randomNum;
    }
}
