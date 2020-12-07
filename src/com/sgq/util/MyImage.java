package com.sgq.util;

import com.sgq.pojo.base.BaseBird;
import com.sgq.pojo.base.impl.GreenColumn;
import com.sgq.pojo.base.impl.PinkColumn;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Author : sgq
 * Date : 2020/11/26 15:48
 */
public class MyImage {
    private static BufferedImage[] img = new BufferedImage[4] ; //默认绿色上柱子
    private static BufferedImage[] birdImageArray = new BufferedImage[3];
    private static String [][] bird_color =
            new String[][]{
                    {"../../../../img/bird0_0.png","../../../../img/bird0_1.png","../../../../img/bird0_2.png"},
                    {"../../../../img/bird1_0.png","../../../../img/bird1_1.png","../../../../img/bird1_2.png"},
                    {"../../../../img/bird2_0.png","../../../../img/bird2_1.png","../../../../img/bird2_2.png"}
                       };
    static {
        try {
            img[0]= ImageIO.read(GreenColumn.class.getResource("../../../../../img/pipe_down.png"));
            img[1]= ImageIO.read(GreenColumn.class.getResource("../../../../../img/pipe_up.png"));
            img[2]= ImageIO.read(PinkColumn.class.getResource("../../../../../img/pipe2_down.png"));
            img[3]= ImageIO.read(PinkColumn.class.getResource("../../../../../img/pipe2_up.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage[] getImgArray() {
        return img;
    }

    /**
     * 返回一组小鸟图片（3张）
     * */
    public static BufferedImage [] getBirdImageArray(String color) throws IOException {
             if(color.equals("yellow")){
                for(int j = 0;j<bird_color[0].length;j++){
                    birdImageArray[j]=ImageIO.read(BaseBird.class.getResource(bird_color[0][j]));
                }
             }else if(color.equals("green")){
                 for(int j = 0;j<bird_color[1].length;j++){
                     birdImageArray[j]=ImageIO.read(BaseBird.class.getResource(bird_color[1][j]));
                 }
             }else {
                 for(int j = 0;j<bird_color[2].length;j++){
                     birdImageArray[j]=ImageIO.read(BaseBird.class.getResource(bird_color[2][j]));
                 }
             }
             return birdImageArray;
    }

    public static BufferedImage getOneImg(String path){
        try {
           return ImageIO.read(MyImage.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
