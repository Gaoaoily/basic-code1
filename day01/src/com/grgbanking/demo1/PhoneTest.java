package com.grgbanking.demo1;

public class PhoneTest {

    public static void main(String[] args) {

        //创建手机的对象
        Phone p1 = new Phone();

        //给手机对象赋值
        p1.brand = "xiaomi";
        p1.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p1.brand);
        System.out.println(p1.price);

        //调用手机中的方法
        p1.call();
        p1.playGame();

    }
}
