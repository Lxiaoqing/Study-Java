package com.zeroten.javales.util;

public class StringUtils {
    public static String trimAll(String str){
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < str.length(); index++)
        {
            if(str.charAt(index) == ' '){
                continue;
            }
            sb.append(str.charAt(index));
        }
        return sb.toString();
    }

    public static String reverse(String hello){
        StringBuilder sb = new StringBuilder();
        char[] chars = hello.toCharArray();
        for (int index = chars.length - 1; index >= 0; index--){
            sb.append(chars[index]);
        }
        return sb.toString();
    }

}
