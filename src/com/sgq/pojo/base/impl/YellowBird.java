package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseBird;
import com.sgq.util.MyImage;

import java.io.IOException;

/**
 * Author : sgq
 * Date : 2020/11/27 21:24
 */
public class YellowBird extends BaseBird {

    public YellowBird(){
        try {
            super.birdImageArray = MyImage.getBirdImageArray("yellow");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
