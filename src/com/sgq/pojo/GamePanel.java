package com.sgq.pojo;

import com.sgq.pojo.base.BaseBird;
import com.sgq.pojo.base.BaseColumn;
import com.sgq.pojo.base.BaseGameFactory;
import com.sgq.pojo.base.impl.Land;
import com.sgq.pojo.base.impl.MorningFactory;
import com.sgq.util.MyDistance;
import com.sgq.util.MyImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Author : sgq
 * Date : 2020/11/24 20:09
 */
public class GamePanel extends JPanel{
    private BufferedImage bg;
    private Land bgLand;
    private Land movableLand;
    public List<BaseColumn [] > columnList = new ArrayList<>();
    public BaseBird baseBird;
    private int bird_count = 0;
    boolean runStatus = false;
    int lose_count = 0;
    Thread column ;
    Thread birdThread;



    public GamePanel(){

        setBackground(Color.PINK);
        try{
            bg= ImageIO.read(this.getClass().getResource("/img/bg_day.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bgLand = new Land();
        movableLand = new Land();
        BaseGameFactory baseGameFactory =new MorningFactory();
        columnList.add(baseGameFactory.createColumn(302));
        columnList.add(baseGameFactory.createColumn(420));
        columnList.add(baseGameFactory.createColumn(528));
        baseBird =baseGameFactory.createOneBird();
        column= new ColumnThread();
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                baseBird.commonFly();
                if(!column.isAlive()){
                    column.start();
                }
                if(runStatus!=true){

                    runStatus=true;
                }

            }
        };
         this.addMouseListener(mouseAdapter);
         birdThread=new BirdThread();
         birdThread.start();
    }




    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(bg,0,0,null);
        g.drawImage(bgLand.getImg(),bgLand.getX(),bgLand.getY(),null);
        for(int i = 0;i<columnList.size();i++){
            g.drawImage(columnList.get(i)[0].getImg(),columnList.get(i)[0].getX(),columnList.get(i)[0].getY(),null);
            g.drawImage(columnList.get(i)[1].getImg(),columnList.get(i)[1].getX(),columnList.get(i)[1].getY(),null);
        }

        g.drawImage(movableLand.getImg(),movableLand.getX(),movableLand.getY(),null);
        g.drawImage(baseBird.birdImageArray[bird_count],baseBird.getX(),baseBird.getY(),null);

        if(runStatus==false){
            g.drawImage(MyImage.getOneImg("/img/title.png"),55,120,null);
            g.drawImage(MyImage.getOneImg("/img/button_rate.png"),107,250,null);
            g.drawImage(MyImage.getOneImg("/img/button_play.png"),14,330,null);
            g.drawImage(MyImage.getOneImg("/img/button_score.png"),158,330,null);
        }


    }

    class BirdThread extends Thread{
        Boolean movDir =false; //false向上  true向下
        @Override
        public void run() {
            while (true){
                if(runStatus==true){
                    baseBird.drop();
                }
                int y= baseBird.getY();
                bird_count++;
                movableLand.move();
                if(runStatus==false){
                    if(y==200){
                        movDir=false;
                    }
                    if(y==180){
                        movDir=true;
                    }
                    if(movDir){
                        y++;
                    }else {
                        y--;
                    }
                    baseBird.setY(y);
                }

                if(bird_count>2){
                    bird_count=0;
                }

                try {
                    repaint();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }



     class ColumnThread extends Thread{
        @Override
         public void run(){
            while (true){
//                baseBird.drop();
                Iterator it = columnList.iterator();
                while (it.hasNext()){
                    BaseColumn [] baseColumns1 = (BaseColumn[]) it.next();
                    boolean b1 = baseColumns1[0].commonMove(); //上柱移动
                    boolean b2 = baseColumns1[1].commonMove();//下柱移动
                    if(!BaseColumn.isAttackBird(baseColumns1,baseBird)){
                        System.out.println("正常运行");
                    }else {
                        System.out.println("撞墙了");
                        column.stop();

                    }
                    if(b1==true){
                        baseColumns1[0].setY(MyDistance.getUpRandom());
                    }
                    if(b2==true){
                        baseColumns1[1].setY(MyDistance.getDownRandom());
                    }
                        //当上柱跟下柱都溢出窗口 ,重新给其图片赋值
                    if(b1==true&&b2==true){

                        if(MyDistance.getRandom(10)%2==0){
                            baseColumns1[0].setImg(MyImage.getImgArray()[0]);
                            baseColumns1[1].setImg(MyImage.getImgArray()[1]);
                        }else {
                            baseColumns1[0].setImg(MyImage.getImgArray()[2]);
                            baseColumns1[1].setImg(MyImage.getImgArray()[3]);
                        }

                    }

                    try {
                        Thread.sleep(5);
                        repaint();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }



                }

            }



        }

    }


}
