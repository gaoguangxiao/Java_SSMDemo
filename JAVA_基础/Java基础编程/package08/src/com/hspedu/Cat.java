package com.hspedu;

//extends 实现了继承
public class Cat extends Animal{

    public String name = "B";
//    Cat(){
//        System.out.println("Cat");
//    }
//
//    public Cat(String name) {
//        this.name = name;
//        System.out.println("Cat(name)");
//    }

    //main不同类 不同包访问 public修饰
    public void run(){
        System.out.println(this.name+"跑步");
    }
}
