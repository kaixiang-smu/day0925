package com.qf.homework4;

public class Adult {
    String name;
    int age;

    Child child;
    Toy toy;

    public void work(){
        System.out.println("成年人工作");
    }

    public static void main(String[] args) {
        Adult adult = new Adult();
        adult.name = "大明";
        adult.age = 30;
        adult.child = new Child();
        adult.child.name = "小明";
        adult.child.age = 1;
        System.out.println(adult.name);
        System.out.println(adult.age);
        adult.work();
        System.out.println(adult.child.name);
        System.out.println(adult.child.age);
        adult.child.play();

        adult.child.toy = new Toy();
        adult.child.toy.color = "黑";
        adult.child.toy.price = 10;
        System.out.println(adult.child.toy.color);
        System.out.println(adult.child.toy.price);
        adult.child.toy.song();
    }
}
