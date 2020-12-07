package com.sgq.pojo.base;

/**
 * Author : sgq
 * Date : 2020/11/25 16:20
 */
public abstract class BaseGameFactory {
    public abstract BaseColumn [] createColumn(int x);
    public abstract BaseBackground createBackground();
    public abstract BaseBird createOneBird();
}
