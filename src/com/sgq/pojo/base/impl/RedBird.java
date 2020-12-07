package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseBird;
import com.sgq.util.MyImage;

import java.io.IOException;

/**
 * Author : sgq
 * Date : 2020/11/27 18:48
 */
public class RedBird extends BaseBird {

     public RedBird(){
          try {
               super.birdImageArray = MyImage.getBirdImageArray("red");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }


}
