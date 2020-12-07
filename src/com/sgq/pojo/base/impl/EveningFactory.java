package com.sgq.pojo.base.impl;

import com.sgq.pojo.base.BaseBackground;
import com.sgq.pojo.base.BaseBird;
import com.sgq.pojo.base.BaseColumn;
import com.sgq.pojo.base.BaseGameFactory;

/**
 * Author : sgq
 * Date : 2020/11/25 19:30
 */
public class EveningFactory extends BaseGameFactory {


    @Override
    public BaseColumn[] createColumn(int x) {
        return new BaseColumn[0];
    }

    @Override
    public BaseBackground createBackground() {
        return null;
    }

    @Override
    public BaseBird createOneBird() {
        return null;
    }
}
