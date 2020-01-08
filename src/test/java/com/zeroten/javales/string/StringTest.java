package com.zeroten.javales.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void testString() {
        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1 == str2);

        String str3 = "hello word";
        String str4 = str1 + "word";
        System.out.println(str3 == str4);

        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5 ==  str6);

        String str7 = str6.intern();
        System.out.println(str1 == str7);
    }

    @Test
    public void testLength() {
        String str1 = "hello word";
        System.out.println(str1.length());
    }

    @Test
    public void testSubstring() {
        String str1 = "hello,word!";
        String str2 = str1.substring(0,5);
        System.out.println(str2);
    }

    @Test
    public void testFormat(){
        String  str1 = "大写a：" + 'A' + " " + "\n";
        System.out.println(str1);

        String str2 = String.format("大写a：%c %n", 'A');
        System.out.println(str2);
    }

    @Test
    public void testEqual(){
        String str = "hello";
        String str2 = "Hello";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
    }

    @Test
    public void testJu(){
        String str1 = "hello";
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith(" h"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.endsWith("llo"));
        System.out.println(str1.endsWith("o "));
        System.out.println(str1.contains("ello"));
        System.out.println(str1.contains("elo"));
    }

    @Test
    public void testFind(){
        String str1 = "hello, world. today si 2019-12-10. say hi to me.";
//        for (int  index = 0; index < str1.length(); index++){
//
//        }
        int index = -1;
        do {
            int at1 = str1.indexOf("o", index + 1);
            if (at1 == -1){
                break;
            }
            System.out.println(String.format("第 %d 位是小写字母o", at1 + 1));
            index = at1;
            //System.out.println(at1);
        } while (true);
//        int at1 = str1.indexOf("o", 7);
//        System.out.println(at1);
        int at2 =  str1.lastIndexOf("o");
        System.out.println(at2);
        int index2 = str1.length();
        do {
            int at3 = str1.lastIndexOf("o", index2 - 1);
            if (at3 == -1){
                break;
            }
            System.out.println(String.format("第 %d 位是小写字母o", at3 + 1));
            index2 = at3;
            //System.out.println(at1);
        } while (true);
    }

    @Test
    public void testRepl(){
        System.out.println("hello,world!".replace("o","0"));
        System.out.println("hello,world!".replaceAll("o","0"));
    }

    @Test
    public void testRemovePlace(){
        String str1 = "     hello    ";
        System.out.println(str1.trim());
        System.out.println(str1.trim().toUpperCase());
        System.out.println(str1.trim().toLowerCase());

        String strEmpty = "";
        String strNUll = null;
    }

    @Test
    public void testNew(){
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);
        //StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("hello");
        sb2.append(',');
        sb2.append("world");
        sb2.append('.');
        System.out.println(sb2.toString());
    }

    @Test
    public void testNew2(){
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);
        //StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer(100);
        sb2.append("hello");
        sb2.append(',');
        sb2.append("world");
        sb2.append('.');
        System.out.println(sb2.toString());
    }

    @Test
    public void testOpt(){
        String str1 = "hello" + "world";
        System.out.println(str1);
        String str2 = "hello,world.";

    }

    @Test
    public void testOpt2(){
        long start = System.currentTimeMillis();
        String str = "";
        for (int n = 0; n < 50000; n++){
            str += n;
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时： %d ms", System.currentTimeMillis() - start));
    }

}
