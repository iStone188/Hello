package com.helloandroid.boco.hello;

public class Bean {
    private String title;
    private String name;
    private String time;
    private String phone;

    public Bean() {

    }

    public Bean(String title, String name, String time, String phone) {
        this.title = title;
        this.name = name;
        this.time = time;
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void  setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
