package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseBackground;
import com.sgq.pojo.base.BaseBird;
import com.sgq.pojo.base.BaseColumn;
import com.sgq.pojo.base.BaseGameFactory;
import com.sgq.util.MyDistance;

import java.util.Random;

/**
 * Author : sgq
 * Date : 2020/11/25 19:29
 */
public class MorningFactory extends BaseGameFactory {
    @Override
    public BaseColumn[] createColumn(int x) {
        Random rd = new Random();
        if(rd.nextInt(10)%2==0){
            return new GreenColumn(x).getTwoColumns();
        }
        return new  PinkColumn(x).getTwoColumns();
    }

    @Override
    public BaseBackground createBackground() {
        return null;
    }

    @Override
    public BaseBird createOneBird() {
         BaseBird baseBird;
        int num = MyDistance.getRandom(10);
        System.out.println(num);
        if(num<=3){
                baseBird = new YellowBird();

        }else if(num>3&&num<=6) {
               baseBird = new GreenBird();
        }else {
               baseBird = new RedBird();
        }
        return baseBird;

    }
}
