package com.grgbanking.demo1;

import java.util.Scanner;

public class GoodsTest {

    public static void main(String[] args) {


        Goods g1 = new Goods("001", "phone", "4999", 20);
        Goods g2 = new Goods("002", "cup", "499", 203);
        Goods g3 = new Goods("003", "paper", "49", 2044);


        Goods[] arr = new Goods[3];
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }


        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数");
//        int num = sc.nextInt();
//        System.out.println(num);
//        //输入123 123,得到的结果
//
//        System.out.println("请输入第二个整数");
//        int num2 = sc.nextInt();
//        System.out.println(num2);

        System.out.println("请输入第三个整数");
        String num3 = sc.nextLine();
        System.out.println(num3);


    }
}
