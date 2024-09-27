package com.qf.oop;

public class TestOOP2 {
    public static void main(String[] args) {
        /**
         * 类是模板，可以创建出多个对象
         */
        Phone p1 = new Phone();
        System.out.println(p1);
        p1.brand = "Huawei";
        p1.type = "P30";
        p1.color = "翡翠绿";
        p1.price = 3999.9;
        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.color);
        System.out.println(p1.price);

        Phone p2 = new Phone();
        System.out.println(p2);
        System.out.println(p2.brand);
        System.out.println(p2.type);
        System.out.println(p2.color);
        System.out.println(p2.price);

        Phone p3 = p2;
        System.out.println(p3);
        p3.price = 4998.8;
        System.out.println(p3.price);
        System.out.println(p2.price);
    }
}
