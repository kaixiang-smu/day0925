package com.qf.homework2;
// 第4题(引用)
public class Demo3 {
    static class MyClass{
        int value;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b++; // b = 11;
        System.out.println(a); // a = 10
        MyClass mc1 = new MyClass();
        mc1.value=10;
        MyClass mc2 = mc1;
        mc2.value++;
        System.out.println(mc1.value);
    }
}

