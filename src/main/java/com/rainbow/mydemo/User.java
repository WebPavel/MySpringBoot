package com.rainbow.mydemo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {
    int uid;
    String uname;
    @JSONField(format = "yyyy-MM-dd")
    Date birthday;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
