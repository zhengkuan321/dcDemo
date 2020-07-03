package com.dc.bean.basic;

/**
 * @ClassName User
 * @Description: 用户表
 * @Author 王飞鱼
 * @Date 2020-7-2
 * @Version V1.0
 **/
public class User {
    private int id;
    private String name;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
