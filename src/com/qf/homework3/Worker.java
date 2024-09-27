package com.qf.homework3;

public class Worker {
    String name;
    int age;
    double salary;

    Address addr;

    public Worker(){}

    public Worker(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("工作");
    }

    public void work(int hours){
        System.out.println("工作"+hours+"个小时");
    }

    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name = "张三";
        w1.age = 19;
        w1.salary = 39999.9;
        System.out.println(w1.name);
        System.out.println(w1.age);
        System.out.println(w1.salary);
        w1.work();
        w1.work(8);

        Worker w2 = new Worker("李四", 20, 25999.9);
        System.out.println(w2.name);
        System.out.println(w2.age);
        System.out.println(w2.salary);
        w2.work();
        w2.work(10);

        Worker worker = new Worker();
        worker.name = "zhangsan";
        worker.age = 25;
        worker.salary = 2500;

        // 因为addr的数据类型是Address类型
        worker.addr = new Address();
        System.out.println(worker.addr);
        worker.addr.address = "北京市海淀区清华园1号";
        worker.addr.zipCode = "100084";
        System.out.println(worker.name);
        System.out.println(worker.age);
        System.out.println(worker.salary);
        System.out.println(worker.addr.address);
        System.out.println(worker.addr.zipCode);
    }
}
