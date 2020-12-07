package com.sgq.pojo.base.impl;
import com.sgq.pojo.base.BaseColumn;
import com.sgq.util.MyDistance;
import com.sgq.util.MyImage;


import java.awt.image.BufferedImage;



/**
 * Author : sgq
 * Date : 2020/11/25 16:42
 */
public class GreenColumn extends BaseColumn {

    public GreenColumn(int x){
        columns[0]=new GreenColumn(x, MyDistance.getUpRandom(), MyImage.getImgArray()[0]);
        columns[1]=new GreenColumn(x,MyDistance.getDownRandom(),MyImage.getImgArray()[1]);
    }

    public GreenColumn(int x, int y, BufferedImage img){
            super.setX(x);
            super.setY(y);
            super.setImg(img);
    }


}
