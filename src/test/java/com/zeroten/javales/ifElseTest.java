package com.zeroten.javales;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ifElseTest {

    @Test
    public void testIfElse() {
        int age = 10;
        if (age < 7) {
            System.out.println(age + "岁，属于儿童");
        } else if (age > 6 && age < 18) {
            System.out.println(age + "岁，属于少年");
        } else if (age > 17 && age < 41) {
            System.out.println(age + "岁，属于青年");
        } else if (age > 40 && age < 60) {
            System.out.println(age + "岁，属于中年");
        } else {
            System.out.println(age + "岁，属于老年");
        }
    }

    @Test
    public void testWhile() {

        boolean isContinue = true;
        int times = 0;

        while (isContinue) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                isContinue = false;
                System.out.println(r + "能被30整除，退出循环");
            } else {
                System.out.println(r + "不能被30整除，继续循环");
                times++;
            }
        }
        System.out.println("随机产生了" + times + "个不能被30整除的数");
    }

    @Test
    public void testDoWhile() {

        boolean isContinue = true;
        int times = 0;

        do {
            int r = new Random().nextInt(1000);
            if(r % 30 == 0){
                isContinue = false;
                System.out.println(r + "能被30整除，退出循环");
            } else {
                System.out.println(r + "不能被30整除，继续循环");
                times++;
            }
        } while (isContinue);
        System.out.println("随机产生了" + times + "个不能被30整除的数");
    }

    @Test
    public void testFor() {
        int total = 0;
        for (int n = 0; n < 101; n++) {
            if(n % 2 != 0){
                System.out.println(n + "是一个单数");
                total++;
            }
        }
        System.out.println("0 ~ 100 范围内有" + total + "个单数");
    }

    @Test
    public void testSwitch() {
        int cmdN = 2;
        switch (cmdN) {
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
                break;
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }
    }

    @Test
    public void testBreak() {

        int total = 0;
        while (true) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0){
                System.out.println(r  + "能被30整除，退出");
                break;
            } else {
                System.out.println(r + "不能被30整除，继续");
                total++;
            }
        }
        System.out.println(total);
    }

    int getMaxNumRem7(int n1, int n2) {
        for (int n = n2; n >= 0; n--){
            if(n % n1 == 7) {
                return  n;
            }
        }
        return -1;
    }

    @Test
    public void testReturn() {
        int r1 = getMaxNumRem7(10, 1000);
        System.out.println(r1);
    }

    @Test
    public void testContinue() {
        int total = 0;
        for (int  n = 0;  n < 100; n++){
            if(n % 7 != 0){
                continue;
            }
            System.out.println(n + "能被7整除");
            total++;
        }
        System.out.println("0 ~ 100 之间共有" + total + "能被7整除");
    }

    //String AgeCheck.getAgeName(int age)

    @Test
    public void testAgetCheck(){
        // given
        // when
        // then
        Assert.assertEquals(getAgeName(6), "儿童");
        Assert.assertEquals(getAgeName(8), "少年");
        Assert.assertEquals(getAgeName(26), "青年");
        Assert.assertEquals(getAgeName(48), "中年");
        Assert.assertEquals(getAgeName(68), "老年");
    }

    public static  String getAgeName(int age) {
        if (age < 7){
            return "儿童";
        }
        if (age < 18){
            return "少年";
        }
        if (age < 41){
            return "青年";
        }
        if (age < 60){
            return "中年";
        }

//        if (age > 59){
//            return "老年";
//        }
        return "老年";
    }

}
