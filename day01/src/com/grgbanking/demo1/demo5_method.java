package com.grgbanking.demo1;

public class demo5_method {
    public static void main(String[] args) {
        //
//        playGame();
//        playGame();
//        getSum(10,50);
//        System.out.println(getSum(10,50));
//        int sum = getSum(30,49);
//        System.out.println(sum);


//    public static void playGame() {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//    }

//    public static int getSum(int longside,int wideside){
////        int a ;
////        int b ;
//
//        int result = (longside+wideside)*2;
//        //System.out.println(result);
//        return result;
//    }
//        double area1 = getArea(3.5, 9.5);
//        double area2 = getArea(4.5, 8.5);
//
//
//        if (area1 > area2) {
//            System.out.println("shu");
//        }else{
//            System.out.println("ying");
//        }
        int[] arr = new int[]{11, 22, 33, 44, 55};
        //bianli(arr);
        //System.out.println();不打印数据只换行
        //System.out.println(getMax(arr));
        boolean flag = contains(55,arr);
        System.out.println(flag);
    }

//    //比较两个长方形的面积
//    public static double getArea(double longside, double wideside) {
//        double area = longside * wideside;
//        return area;
//    }
//    public static void fn(int a){
//
//    }

    //设计一个方法用于数组遍历,要求便利的结果是在一行上的.例如[11,22,33,44,55]
    public static void bianli(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }


    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean contains(int num, int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }


}