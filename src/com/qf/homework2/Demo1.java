package com.qf.homework2;
// 第1题(重载，实例变量)
public class Demo1 {
    static class ClassA{
        public void method(int value){
            System.out.println(value);
        }
        public void method(){
            System.out.println(value);
        }
        int value;
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.value = 10;
        classA.method();
        classA.method(20);
    }
}
