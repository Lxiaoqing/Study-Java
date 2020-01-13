package com.zeroten.javales.classobject;

public class ClassStaticTest {
    private static final int MAX_COUNT;
    private static int count = 0;

    {
        //代码块。也可称为初始化代码块
    }
    static {
        MAX_COUNT = 6;
    }

    public ClassStaticTest() throws Exception{
        count++;
        if (count > MAX_COUNT){
            throw new Exception("只能创建" + MAX_COUNT + "个对象");
        }
    }

    public static void printCount(){
        System.out.println("总共有" + count + "个实例");
    }

    public static void main(String[] args) throws Exception{
     new ClassStaticTest();
     ClassStaticTest obj2 = new ClassStaticTest();
     new ClassStaticTest();
     new ClassStaticTest();
     new ClassStaticTest();
     new ClassStaticTest();
     new ClassStaticTest();

     ClassStaticTest.printCount();
     obj2.printCount();
    }
}
