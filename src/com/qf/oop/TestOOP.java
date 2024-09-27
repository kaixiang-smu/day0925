package com.qf.oop;

public class TestOOP {
    public static void main(String[] args) {
        // 创建对象
        // 数据类型  变量   =   值;
        // int[]   数组名  =  new int[3];
        //   类名   对象名  =  new 类名();
        Phone p1 = new Phone();
        /**
         * 使用对象，无非就是使用对象内部的属性和方法
         * ------------------------------------
         * 属性就是变量，使用属性就是变量的取值赋值
         * ------------------------------------
         * 取出属性值：
         *     数据类型 变量名 = 对象名.属性名;
         * 属性赋值:
         *     对象名.属性名 = 值;
         */
        // 属性取值
        double price = p1.price;
        System.out.println(price);
        String brand = p1.brand;
        System.out.println(brand);
        String color = p1.color;
        System.out.println(color);
        String type = p1.type;
        System.out.println(type);
        // 属性赋值
        p1.brand = "Huawei";
        p1.type = "mata60";
        p1.color = "曜石黑";
        p1.price = 5999.9;
        // 再次取值
        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.color);
        System.out.println(p1.price);
        /**
         * 对象使用另外一个操作，就是使用对象的方法
         * 使用方法就是调用方法让其执行
         * 语法：
         *     [数据类型 变量名 = ]对象名.方法名([实参]);
         */
        p1.call("110");
        p1.playGame();
    }
}
