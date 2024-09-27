package com.qf.oop;

public class Pig {
    // 成员属性
    String type;
    String color;
    int age;
    /**
     * 构造方法默认隐式提供
     * 也可以显示写出
     * 1）构造方法没有返回值，也不能写void
     * 2）构造方法名一定是当前类名
     */
    public Pig(String type,String color,int age){
        System.out.println("构造方法执行");
        this.type = type;
        this.color = color;
        this.age = age;
    }
    public Pig(){

    }
    // 成员方法
    public void gong(){
        System.out.println("拱白菜");
    }

    public static void main(String[] args) {
        // 通过构造方法创建对象
        Pig pig = new Pig("家养","粉色",1);
        System.out.println(pig.type);
        System.out.println(pig.color);
        System.out.println(pig.age);
        pig.type = "野生";
        pig.color = "黑色";
        pig.age = 3;
        System.out.println(pig.type);
        System.out.println(pig.color);
        System.out.println(pig.age);
        Pig pig1 = new Pig();
        // 凡是带()的都是方法
        // 经典重载，println是有多个重名方法，但是参数列表不一样
        // 好处就是统一方法名，完成统一的动作，目的是方便调用方法
        System.out.println(); // 空参
        System.out.println(1); // int型参数
        System.out.println("aaa"); // String型参数
    }
}
