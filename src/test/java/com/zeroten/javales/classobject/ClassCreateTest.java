package com.zeroten.javales.classobject;

public class ClassCreateTest {

    //private String name = "这是一个成员变量";
    //private static int maxCount = 10;
    private static int maxCount;
    private String name;

    {
        //name = "这是一个成员变量";
    }

    static {
        maxCount = 10;
    }

    public ClassCreateTest(){
        name = "这是一个成员变量";
    }

    public void println(){
        System.out.println(name);
    }

    public static void main(String[] args){
        new ClassCreateTest().println();
    }

}
