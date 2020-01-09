package com.zeroten.javales.array;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayDeclare(){

        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }

    @Test
    public void testFuzhi(){
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));

        Object[] arr4 = new Object[5];
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = new int[] {1, 2, 3,};
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {1,2,3,3,3,3};
        System.out.println(Arrays.toString(arr6));

        String[] arr7 = {"321", null, ""};
        System.out.println(Arrays.toString(arr7));

        Integer[] arr8 = {2, 5, 6, null, 0, 5};
        System.out.println(Arrays.toString(arr8));
    }

    @Test
    public void testBianLi(){
        Integer[] arr = {1, 2, 3, 4, 5};
        //for
        for (int i = 0; i < arr.length; i++){
            //System.out.println("下标：" + i + "，存放的值是：" + arr[i]);
            System.out.println(String.format("下标：%d, 存放的值是：%d", i, arr[i]));
        }
        //foreach
        int index = 0;
        for (int val : arr){
            System.out.println(String.format("第 %d 次取到 %d", index, val));
            index++;
        }
        //lambda表达式
        Arrays.asList(arr).forEach(val -> {
            System.out.println(String.format("值是 %d", val));
            if(val % 2 == 0){
                System.out.println("偶数");
            } else {
                System.out.println("奇数");
            }
        });
    }

    @Test
    public void testCopy(){
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9, 10};
        Integer[] arr11 = new Integer[3];
        arr11[0] = arr1[0];
        arr11[1] = arr1[1];
        arr11[2] = arr1[2];
        System.out.println(Arrays.toString(arr11));

        Integer[] arr12 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr12));

        Integer[] arr13 = Arrays.copyOfRange(arr1, arr1.length - 3, arr1.length);
        System.out.println(Arrays.toString(arr13));

        Integer[] arr14 = Arrays.copyOfRange(arr1, 0, 2);
        System.out.println(Arrays.toString(arr14));

        System.arraycopy(arr2, arr2.length - 3, arr1, arr1.length - 3, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
