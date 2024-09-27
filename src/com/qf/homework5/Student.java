package com.qf.homework5;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study(){
        System.out.println("学习");
    }
}
