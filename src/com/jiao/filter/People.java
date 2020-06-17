package com.jiao.filter;

public class People {
    private String name;
    private int live;

    public People(String name, int live) {
        this.name = name;
        this.live = live;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }
}
