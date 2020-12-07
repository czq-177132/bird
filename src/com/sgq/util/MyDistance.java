package com.sgq.util;

import java.util.Random;

/**
 * Author : sgq
 * Date : 2020/11/26 15:37
 */
public class MyDistance {

    private static Random random= new Random();
    public static  int  getUpRandom (){
       return  -(random.nextInt(51)+140);
    }

    public static  int  getDownRandom (){
        return  random.nextInt(51)+220;
    }
    public static  int  getRandom(int bounds){
      return   random.nextInt(bounds);
    }




}
