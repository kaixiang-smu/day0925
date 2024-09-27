package com.qf.homework;

import java.util.Arrays;

/**
 * 写一个方法 用于合并两个int类型的数组  合并法则如下
 * {1，2，5，8，9}{1，3，0}------>{0,1,2,3,5,8,9}
 */
public class Demo2 {
    /**
    public static void main(String[] args) {
        int[] arr = changeLength();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] changeLength(){
        int[] arr1 = {1,2,5,8,9};
        int[] arr2 = {1,3,0};
        int[] arr = Arrays.copyOf(arr1,8);
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr2, 0, arr, 5, arr2.length);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,5,8,9};
        int[] arr2 = {1,3,1,3,6,7};
//        int[] arr = arrayConcat(arr1, arr2);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        set(arr1,arr2);
    }

    /**
     * 去重的整体思路
     * 1 新建一个与原数组一样长度的数组，用来存储去重后的数组
     *   为什么一样长？极限的思想，全部一样，只剩1，都不一样，一样长
     * 2 从原数组取值向新数组放，但是如果新数组中有该元素，则不放
     *   需要记录存入多少个元素
     * 3 需要再创建一个数组，数组长度是上一步记录的元素个数
     *   然后从去重数组中拷贝元素到最后的这个数组
     */
    /**
     * 这个去重这一步有点问题，就是没法处理0的问题
     * 先把0去掉，换成没有0的其他重复数组进行去重
     * 重点体会上述去重整体思路
     */

    public static void set(int[] arr1,int[] arr2){
        int[] arr3 = arrayConcat(arr1, arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = new int[arr3.length];
        int count=0;
        for (int i = 0; i < arr3.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr4.length; j++) {
                if (arr3[i]==arr4[j]){
                    flag = true;
                }
            }
            if (!flag){
                arr4[count]=arr3[i];
                count++;
            }
       }
        int[] arr5 = new int[count];
        System.arraycopy(arr4,0,arr5,0,count);
        System.out.println(Arrays.toString(arr5));
    }

    public static int[] arrayConcat(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        return arr3;
    }
}
