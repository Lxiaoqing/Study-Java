package com.zeroten.javales.interfaces;

import org.junit.Test;

public class CopyTest {

    @Test
    public void testCopy() throws CloneNotSupportedException{
        Employee e1 = new Employee();
        Employee e2 = e1.clone();
    }

}
