package com.sgq.pojo;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/13 17:15
 */
public class MyTest {

    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print(i+ "*" +j +"=" + i*j+" ");
//            }
//            System.out.println();
//        }


       /* for (int i = 1; i < 8; i++) {
            // i = 2;

           for (int j = 1; j < 8; j++) {
                // j = 1;
                System.out.println("i: "+ i);

                System.out.println("j: "+ j);
                System.out.println("==============");
            }

        }*/

        String  [] arr = {"king","queen","jack","10","9"};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("i:" +i +"===>"+"arr["+i+"]："+arr[i]);
//
//        }
        int a = 1+3;
        // byte (short int long)
        // 0000 0001
        // 0000 0010
        // 0000 0011
        // 0000 0100
        //      0101
        //      0110
        //      0111 =  0100(4) + 0010(2) +0001(1)
        //      1000 = 2^3
        // .....
        // .....
        // 1111 1111 2^6+2^5+2^4+2^3+2^2+2^1+2^0 = 64+32+16+8+4+2+1 = 127

        // 2 = 10

        // 4 = 100

        //8  = 1000

        String b = 1+ "3";
        String c = 22+ "3";
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("BYTE_MAX:"+Byte.MAX_VALUE);
        long jj = 2147483648L;
        System.out.println("Integer.MAX_VALUE:"+Long.MAX_VALUE);
    }
}
