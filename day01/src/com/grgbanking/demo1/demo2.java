package com.grgbanking.demo1;


import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        //System.out.println(10 / 2);
        //System.out.println(10 % 3);
        /*模的运算用法如下:
        1.A是否可以被B整除
        2.判断A是否为偶数
        3.斗地主发牌
         */


        //需求:键盘录入一个三位数,得到的结果拆分为个位十位百位
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int a = i / 100;
//        int b = (i-a*100) / 10;
//        int c = i-a*100-b*10;
//        int c = i % 10;
//        int b = i / 10 % 10;
//        int a = i / 100 % 10;
//
//
//        int number1 = 10;
//        double number2 = 12.4;
//        double m = number1 + number2;
//        System.out.println(m);
//
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


//        double number3 = 12.4;
//        int number4 = (int) number3;
//        System.out.println(number4);
//        System.out.println(3.7 + "abc");
//
//        int age = 18;
//        System.out.println("我的年龄" + age + "岁");
//        System.out.println("我的年龄" + "age" + "岁");
//        System.out.println(1 + 2 + "abc" + 1 + 2);         //相加顺序是从左到右的
//
//
//        char y = 'A';
//        int result = y;
//        System.out.println(result);
//
//
//        int number6 = 10;
//        int number7 = number6++;//先用后加
//        int number8 = ++number6;//先加后用
//
//
//        System.out.println(number7);
//        System.out.println(number8);
//        System.out.println(number6);
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("自己衣服的时髦度");
//        int myFashion = sc.nextInt();
//        System.out.println("对象衣服的时髦度");
//        int herFashion = sc.nextInt();
//        boolean result = myFashion > herFashion;
//        System.out.println(result);
//
//
//        System.out.println(true & true);
//        System.out.println(true ^ true);


//        //&&和&的区别,||同理
//
//        int a = 10;
//        int b = 10;
//        boolean result2 = ++a<5 && ++b<5;
//        System.out.println(result2);  //result2 = false
//        System.out.println(a);  //a = 11
//        System.out.println(b);  //b = 10  因为是&&,所以当判断a 已经不满足条件的时候,b 就不会在进行自增判断了
//
//        int a2 = 10;
//        int b2 = 10;
//        boolean result3 = ++a2<5 & ++b2<5;
//        System.out.println(result3);
//        System.out.println(a2);  //a = 11
//        System.out.println(b2);  //b=  11


//        /*
//        test: 如果输入的两个数,其中一个有6,或者他们的和是6的倍数,那么true,否则false
//         */
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int a = sc.nextInt();
//        System.out.println("请输入一个整数");
//        int b = sc.nextInt();
//
//        boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;
//        System.out.println(result);


//        //保证了输出两个数字中较大的一个
//        int a = 13;
//        int b = 14;
//        //a > b ? a : b;   如果只这么写会报错,结果必须被使用.
//        int max = a > b ? a : b;
//        System.out.println(max);

//        //判断两只老虎的体重是否相同,结果返回汉字
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一只老虎的体重");
//        int weight1  = sc.nextInt();
//        System.out.println("请输入第一只老虎的体重");
//        int weight2  = sc.nextInt();
//
//        String result = weight1==weight2?"相同":"不相同";
//        System.out.println(result);

//        //获取三个和尚的最高身高
//        int height1 = 195;
//        int height2 = 199;
//        int height3 = 188;
//        //a > b ? a : b;   如果只这么写会报错,结果必须被使用.
//        int temp = height1 > height2 ? height1 : height2;
//        int result2 = height3 > temp ? height3 : temp;
//        System.out.println(result2);



    }
}
