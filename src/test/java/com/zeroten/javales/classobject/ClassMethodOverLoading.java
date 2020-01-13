package com.zeroten.javales.classobject;

import org.junit.Test;

public class ClassMethodOverLoading {

    public void println(){

    }

    public void println(int numb){

    }

    public void  println(String str){

    }

    public void println(int numb1, int numb2){

    }

    @Test
    public void testOverloading() {
        println();
        println(1);
        println("lxq");
        println(1, 2);
    }
}
