package com.jiao.filter;

import java.util.ArrayList;
import java.util.Random;


public class StartDemo {

    public static void main(String[] args) {
        Track thread = new Track();
        new Thread(thread).start();
    }
}
