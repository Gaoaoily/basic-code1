package com.grgbanking.demo3;

public class ArrayUtil {
    //此类为工具类
    //私有化构造方法,为了不让外界创建他的对象
    private ArrayUtil() {
    }


    //需要定义一个静态的,方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //i表示索引
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",  ");
            }
        }
        sb.append("]");
        return sb.toString();
    }



}
