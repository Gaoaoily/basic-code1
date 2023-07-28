package com.grgbanking.demo1;

public class demo6_methodpractice {
    public static void main(String[] args) {

        int[] arr_old = new int[]{11,22,33,44,55};
        int[] copy = copyOfRange(arr_old, 2, 4);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

    }
//将数组arr中从索引from(包含from)到to(不包含to)的元素复制到新数组中,将新数组返回
    public static int[] copyOfRange(int[] arr, int from, int to){

        int[] arr_new = new int[to-from];
        for (int i = from,j= 0; i < to; i++,j++) {
            arr_new[j] = arr[i];
        }
        return arr_new;

    }
}
