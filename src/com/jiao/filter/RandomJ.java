package com.jiao.filter;

import java.util.ArrayList;
import java.util.Random;

public class RandomJ {
    //生成一个随机数
    public  int getRandom(){
        int random= (int) (Math.random()*100);
        return random;
    }
    //获取min-max范围的随机数
    public  int getRandom(int min, int max){
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;

    }
    //将数组存进去
    public  Ground getGround(){
        Ground ground=new Ground();

        ArrayList<People> list = new ArrayList<People>();
        //生成随机个单元
        for (int i = 0; i <getRandom(); i++) {
            People people =new People();
            people.setName("view"+i);
            people.setLive(100);
            list.add(people);
        }
        ground.setPeople(list);

        return  ground;
    }

}
