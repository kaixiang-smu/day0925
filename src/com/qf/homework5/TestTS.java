package com.qf.homework5;

public class TestTS {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.age = 38;
        teacher.name = "老魏";
        // 给数组赋值--> 创建学生数组，将数组地址值赋值给引用
//        teacher.students = new Student[3];
        Student[] students = new Student[3];
        teacher.students = students;
        // 给数组中的元素赋值
        //teacher.students[0] = new Student("李四",18);
        Student s1 = new Student("李四", 18);
        teacher.students[0] = s1;
        Student s2 = new Student("王五", 19);
        teacher.students[1] = s2;

        Student ss = teacher.students[1];
        System.out.println(ss.name);
        System.out.println(ss.age);
    }
}
