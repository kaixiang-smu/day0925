package com.qf.homework2;
// 第5题(构造函数)
public class Demo4 {
    static class MyClass{
        int value;
    // 定义有参构造
    public MyClass(int value){
        this.value = value;
    }
    // 定义无参构造
    public MyClass(){

    }
    }

    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass(10);
        System.out.println(mc1.value);
        System.out.println(mc2.value);
    }
}
