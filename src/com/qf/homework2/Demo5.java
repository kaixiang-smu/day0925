package com.qf.homework2;
// 只要new，都会创建对象
public class Demo5 {
    static class ClassA{
        int value = 10;
    }
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca = getObject();
        System.out.println(ca.value);
    }
    // 类当做返回值
    public static ClassA getObject(){
        ClassA newObject = new ClassA();
        newObject.value+=10;
        return newObject;
    }
}
