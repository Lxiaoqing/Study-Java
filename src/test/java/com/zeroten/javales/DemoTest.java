package com.zeroten.javales;

import org.junit.Test;

public class DemoTest {

    @Test
    public void testBlockScope() {
        int n1 = 100;
        System.out.println(n1);

        {
            int n2 = 200;
            System.out.println(n2);

            {
                System.out.println(n1);
            }
        }

        int n2 = 201;
        System.out.println(n2);
    }
}