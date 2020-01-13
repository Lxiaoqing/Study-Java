package com.zeroten.javales.classobject;

import static com.zeroten.javales.classobject.ClassStaticImport.name;
import static com.zeroten.javales.classobject.ClassStaticImport.println;
import org.junit.Test;

public class ClassStaticImportTest {
    @Test
    public void testUser1(){
        System.out.println(ClassStaticImport.name);

        ClassStaticImport.println();
    }

    @Test
    public void testUser2(){
        System.out.println(name);
        println();
    }
}
