package com.qf.homework;

import java.util.Arrays;

/**
 * 写一个方法 用于合并两个int类型的数组  合并法则如下
 * {1，2，5，8，9}{1，3，0}------>{1，2，5，8，9，1，3，0}
 */
public class Demo1 {
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,5,8,9};
//        int[] arr2 = {1,3,0};
//        int[] arr4 = changeLength1(arr1);
//
//    }
//    public static int[] changeLength1(int[] arr){
//        int[] arr3 = new int[8];
//        System.arraycopy(arr,0,arr3,0,arr.length);
//        return arr3;
//    }


//      public static void main(String[] args) {
//          int[] arr = changeLength();
//          System.out.println(Arrays.toString(arr));
//          int[] arr2 = {1, 3, 0};
//          System.arraycopy(arr2, 0, arr, 5, arr2.length);
//          System.out.println(Arrays.toString(arr));
//      }
//
//    public static int[] changeLength(){
//          int[] arr1 = {1,2,5,8,9};
//          return Arrays.copyOf(arr1,8);
//      }


//    public static void main(String[] args) {
//          int[] arr1 = {1,2,5,8,9};
//          int[] arr = Arrays.copyOf(arr1,8);
//          System.out.println(Arrays.toString(arr));
//          int[] arr2 = {1, 3, 0};
//          System.arraycopy(arr2, 0, arr, 5, arr2.length);
//          System.out.println(Arrays.toString(arr));
//      }
    /**
    public static void main(String[] args) {
        changeLength();
    }
    public static void changeLength(){
        int[] arr1 = {1,2,5,8,9};
        int[] arr2 = {1,3,0};
        int[] arr = Arrays.copyOf(arr1,8);
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr2, 0, arr, 5, arr2.length);
        System.out.println(Arrays.toString(arr));
      }
    */
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,8,9};
        int[] arr2 = {1,3,0};
        //int[] arr = arrayConcat(arr1, arr2);

        int[] arr = arrayConcat1(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
    // 数组合并
    public static int[] arrayConcat(int[] arr1,int[] arr2){
        // 新创建一个数组
        int[] arr3 = new int[arr1.length + arr2.length];
        // 数组拷贝
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        // 数组是引用类型，引用数据类型的默认初始值是null
        return arr3;
    }

    // 手动拷贝
    public static int[] arrayConcat1(int[] arr1,int[] arr2){
        // 新创建一个数组
        int[] arr3 = new int[arr1.length + arr2.length];
        // 数组拷贝
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        // 数组是引用类型，引用数据类型的默认初始值是null
        return arr3;
    }
    public static int[] arrayConcat2(int[] arr1,int[] arr2){
        // 新创建一个数组
        int[] arr3 = new int[arr1.length + arr2.length];
        // 数组拷贝
        for (int i = 0; i < arr3.length; i++) {
            if (i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[i-arr1.length];
            }
        }
        // 数组是引用类型，引用数据类型的默认初始值是null
        return arr3;
    }
}
