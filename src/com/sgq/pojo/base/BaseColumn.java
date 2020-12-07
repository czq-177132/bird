package com.sgq.pojo.base;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

/**
 * Author : sgq
 * Date : 2020/11/25 16:21
 */
public abstract class BaseColumn {
    private  int x =250;
    private int y =350;
    private BufferedImage img; //默认绿色上柱子
    public BaseColumn [] columns = new BaseColumn[2]; //放两个柱子，一上一下，为一组
     {
        try {
            img = read(BaseColumn.class.getResource("../../../../img/pipe_down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    protected  boolean  move(){
         boolean b =false;
        if(x<-img.getWidth()){
            x=288;
            b=true;
        }
//         System.out.println("BaseColumn  move");
         this.x--;
         return b;
    }

    public boolean commonMove(){
      return  this.move();
    }

    protected BaseColumn [] createColumns(){
           return getTwoColumns();
    }
    public  BaseColumn [] getTwoColumns(){
            return columns;
    }

    public static boolean isAttackBird(BaseColumn [] twoColumn,BaseBird bird){
        System.out.println("上柱坐标:"+twoColumn[0].y);
         if(twoColumn[0].x>78){
             return false;
         }else{
             if(twoColumn[0].y+310<bird.getY()&&twoColumn[1].y>bird.getY()+37){
                 return false;
             }
             return true;
         }

    }


}
