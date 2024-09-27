package com.qf.homework2;
// 第2题(方法重载，函数返回值)
public class Demo2 {
    static class ClassA{
        void method(){
            System.out.println("method()");
        }
        int method(int i){
            System.out.println("method(int)");
            return 0;
        }
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.method();
        a.method(10);
    }
}
