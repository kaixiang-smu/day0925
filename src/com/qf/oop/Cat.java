package com.qf.oop;

public class Cat {
    String type;
    String name;
    public void eat(){
        int n = 3;  // 局部变量
        String name = "叮当";
        //System.out.println(name+"吃"+n+"条鱼");
        // 确定this就是当前对象
        // this.属性，可以调用成员变量
        System.out.println(this.name+"吃"+n+"条鱼");
        // this.方法名()调用方法
        this.catchMouse();
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
