package com.zeroten.javales.classobject;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.zip.ZipFile;

public class PkgTest {

    @Test
    public void testPkg(){
        java.util.Date date = new Date();
        System.out.println(date.toString());

        int[] numbs1 = new int[3];
        int[] numbs2 = new int[] {1, 2, 3};
        int[] numbs3 = {2, 3, 4, 5};
        System.out.println(Arrays.toString(numbs1));
        System.out.println(Arrays.toString(numbs2));
        System.out.println(Arrays.toString(numbs3));

        Collection c;
        ZipFile zipFile;
    }
}
