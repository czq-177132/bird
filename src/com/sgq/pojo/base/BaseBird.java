package com.sgq.pojo.base;

import java.awt.image.BufferedImage;

/**
 * Author : sgq
 * Date : 2020/11/25 16:24
 */
public abstract class BaseBird {
    private int x =40;
    private int y = 200;
    int time=0;
    int gravity=5;
    double down_speed=0.03;
    int up_speed=1;


    public static BufferedImage[] birdImageArray;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected void fly(){
         y-=20;
         time=0;
     }
     public void drop(){
        if(y<=362){
            y+=down_speed*time;
            gravity*=time;
            up_speed-=gravity;
            time++;
        }

    }
    public void commonFly(){
        this.fly();
    }
}
