package com.qf.oop;

public class Phone {
     // 一般来说，上面写属性，下面写方法
    /**
     * 类中有属性和方法
     * 属性就是变量
     * 属性需要写在类中方法外
     * 属性定义：[访问修饰符]数据类型 属性名
     * 访问修饰符可写可不写，目前写的话就写public
     */
     String color;
     double price;
     String type;
     String brand;

    /**
     * 行为就是方法
     * 在类中定义的方法不要加static
     * 访问修饰符 返回值类型 方法名([参数]){
     *     // return 值;
     * }
     */
    public void call(String num){
        System.out.println("给"+num+"打电话");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
