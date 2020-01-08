package com.zeroten.javales.util;

import com.zeroten.javales.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;


public class StringUtilsTest {
    //去掉字符串开头、结尾、中间的空格  不使用trim方法

    @Test
    public void testTrimAll(){

        String hello = "hello";
        Assert.assertEquals(StringUtils.trimAll(" hello"), hello);
        Assert.assertEquals(StringUtils.trimAll("    hello"), hello);
        Assert.assertEquals(StringUtils.trimAll("hello "), hello);
        Assert.assertEquals(StringUtils.trimAll("hello    "), hello);
        Assert.assertEquals(StringUtils.trimAll("hel lo"), hello);
        Assert.assertEquals(StringUtils.trimAll("hel    lo"), hello);
        Assert.assertEquals(StringUtils.trimAll("    hel   lo"), hello);
    }

    @Test
    public void testReberse(){
        Assert.assertEquals(StringUtils.reverse("123"), "321");
        Assert.assertEquals(StringUtils.reverse("hello"), "olleh");
    }
}
