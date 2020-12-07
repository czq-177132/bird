package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseBird;
import com.sgq.util.MyImage;

import java.io.IOException;

/**
 * Author : sgq
 * Date : 2020/11/27 21:25
 */
public class GreenBird extends BaseBird {

    public GreenBird(){
        try {
            super.birdImageArray = MyImage.getBirdImageArray("green");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
