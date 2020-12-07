package com.sgq.pojo.base.impl;

/**
 * Author : sgq
 * Date : 2020/11/25 18:10
 */
public class Test {

    static {
        System.out.println(456);
    }
    Test(){
        System.out.println(789);
    }

    public static void main(String[] args) {
        new  Test();
    }
    {
        System.out.println(123);
    }
}
