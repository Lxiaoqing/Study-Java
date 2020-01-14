package com.zeroten.javales.interfaces;

import org.junit.Test;

public class InterfaceTest {

    @Test
    public void test1() {
        //接口不可被实例化
        //Interface i1 = new Interface();
        Interface i1 = new InterfaceImpl();
        i1.method();
        i1.method();
        i1.print();

        System.out.println(i1 instanceof Interface);
        System.out.println(i1 instanceof Interface2);

        System.out.println(Interface.MAX_COUNT);
        System.out.println(InterfaceImpl.MAX_COUNT);
        System.out.println(i1.MAX_COUNT);

        Interface.print0();
    }

}
