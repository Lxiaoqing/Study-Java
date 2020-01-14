package com.zeroten.javales.interfaces;

public interface Interface {
    //内部类
    class InnerClass {

    }

    //内部接口
    interface InnerInterface {

    }

    //内部常量
    int MAX_COUNT = 100;

    //内部方法
    void method();

    default void print(){
        System.out.println("我是一个默认方法");
    }

    static void print0(){
        return;
    }

}
