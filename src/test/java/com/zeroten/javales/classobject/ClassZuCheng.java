package com.zeroten.javales.classobject;

import org.junit.Test;

public class ClassZuCheng {

    //类变量、静态域变量
    private  static String count;
    //实例变量、域变量
    private String name;

    //实例代码块 初始化代码块
    {
        System.out.println("类里、方法之外用大括号括起来的一段代码");
    }

    static {
        //静态代码块，也可以称为静态初始化代码块
        System.out.println("类里、方法之外用大括号括起来的一段代码，且前边用static修饰的一段代码");
    }

    //构造方法
    public ClassZuCheng(){

    }

    //方法
    public void println(){
        {
            System.out.println("代码块");
        }
    }

    //静态方法
    public static void staticPrintln(){

    }

    @Test
    public void test1(){

    }
}
