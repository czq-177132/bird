package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseColumn;
import com.sgq.util.MyDistance;
import com.sgq.util.MyImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * Author : sgq
 * Date : 2020/11/25 16:43
 */
public class PinkColumn extends BaseColumn {

    public PinkColumn(int x){
        columns[0]=new PinkColumn(x,MyDistance.getUpRandom(), MyImage.getImgArray()[2]);
        columns[1]=new PinkColumn(x, MyDistance.getDownRandom(),MyImage.getImgArray()[3]);
    }

    public PinkColumn(int x, int y, BufferedImage img){
        super.setX(x);
        super.setY(y);
        super.setImg(img);
    }
}
