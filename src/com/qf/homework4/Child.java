package com.qf.homework4;

public class Child {
    String name;
    int age;

    Toy toy;

    public void play(){
        System.out.println("小朋友玩耍");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.name = "图图";
        child.age = 3;
        System.out.println(child.name);
        System.out.println(child.age);
        child.play();
        child.toy = new Toy();
        child.toy.color = "红";
        child.toy.price = 100;
        System.out.println(child.toy.color);
        System.out.println(child.toy.price);
        child.toy.song();
    }
}
