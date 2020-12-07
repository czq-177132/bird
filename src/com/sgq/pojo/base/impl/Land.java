package com.sgq.pojo.base.impl;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Author : sgq
 * Date : 2020/11/24 20:19
 */
public class Land {
    private  int x;
    private  int y;
    private  int w;
    private  int h;
    private  BufferedImage img;

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

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public Land(){
        try{
            img= ImageIO.read(this.getClass().getResource("../../../../../img/land.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        x=0;
        h=img.getHeight();
        w=img.getWidth();
        y=512-h;

    }
    public void move(){
         x--;
        if(x<-(w-288)){
           x=0;
        }

    }


}
