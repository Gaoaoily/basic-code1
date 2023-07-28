package com.grgbanking.demo1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class demo3_order {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入女婿的酒量");
//        int wine = sc.nextInt();
//        if (wine > 2) {
//            System.out.println("可以的");
//        }

//        //红绿灯
//        //定义三个变量
//        boolean Greenlight = false;
//        boolean Redlight = true;
//        boolean Yellowlight = false;
//
//        if(Greenlight == true){
//            System.out.println("go!");
//        }if(Redlight == true){
//            System.out.println("stop!");
//        }if(Yellowlight == true){
//            System.out.println("slow!");
//        }
//


//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你身上的金钱有多少");
//        int money = sc.nextInt();
//        if (money > 100) {
//            System.out.println("吃网红餐厅");
//        } else{
//            System.out.println("吃沙县小吃");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的级别");
        int level = sc.nextInt();
        if (level >= 0 && level <= 3) {
            if (level == 1) {
                System.out.println("9折");
            } else if (level == 2) {
                System.out.println("8折");
            } else if (level == 3) {
                System.out.println("7折");
            } else {
                System.out.println("打骨折");
            }
        } else {
            System.out.println("会员等级不符合");
        }


    }


}
