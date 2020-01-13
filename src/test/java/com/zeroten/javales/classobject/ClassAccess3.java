package com.zeroten.javales.classobject;

import org.junit.Test;

public class ClassAccess3 extends ClassAccess {
    @Test
    public void testAcl(){
        //ClassAccess ca = new ClassAccess();
        System.out.println(pub);
        System.out.println(getPub());

        System.out.println(pro);
        System.out.println(getPro());

        System.out.println(def);
        System.out.println(getDef());

        //System.out.println(ca.pri);
        //System.out.println(ca.getPri());
    }
}
