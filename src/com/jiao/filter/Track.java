package com.jiao.filter;

import java.util.ArrayList;

public class Track implements Runnable{

    @Override
    public synchronized void run() {
        //获取随即个场景
        for (int i = 1; i < Math.random()*100; i++) {
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            System.out.println("=====================================这是第"+i+"个场景=====================================");
            RandomJ r=new RandomJ();
            //获取一个场景，以及包含的单元
            Ground ground = r.getGround();
            ArrayList<People> xs = ground.getPeople();
            while (xs.size()>1){
                //获取攻击点数
                int num = r.getRandom(10, 15);
                //获取随机一个单元
                int xsNum = r.getRandom(0, xs.size());
                System.out.println();
                System.out.println("=========当前选手："+xsNum);
                People people = xs.get(xsNum);
                int live = people.getLive()-num;
                people.setLive(live);
                System.out.println("选手"+xsNum+"被攻击掉："+num+"点血量");
                System.out.println("选手"+xsNum+"当前血量："+people.getLive());
                System.out.println("=========当前  选手："+xsNum);
                if(live<1){
                    System.out.println("选手："+ people.getName()+"死掉了=====================================");
                    xs.remove(people);
                    System.out.println("=========当前总人数："+xs.size());
                }
            }
        }
    }
}
