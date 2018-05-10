package com.sml.order.client;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.util.*;

/**
 * Java8 learning
 * Created by 神迷的亮
 * 2018-05-09 16:44
 */
@Slf4j
public class Java8Learning
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {

        Map map = new HashMap();

        List<String> list = Arrays.asList("12", "212", "s");
        //Arrays.asList();asList方法返回的是数组的一个视图。视图意味着，对这个list的操作都会反映在原数组上，而且这个list是定长的，不支持add、remove等改变长度的方法。

        //        list.add("sunml");//报错Exception in thread "main" java.lang.UnsupportedOperationException
        //        at java.util.AbstractList.add(AbstractList.java:148)
        //        at java.util.AbstractList.add(AbstractList.java:108)
        //        at com.sml.order.client.Java8Learning.main(Java8Learning.java:27)

        list.forEach(System.out::println);

        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println(fullName.toString());
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        // Get the system clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis() == System.currentTimeMillis());

        //        base64

        final String text = "Base64 finally in Java 8!";

        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);

        final String love = "sunmingliangxihuanzoudi";
        //bianma
        byte[] encode = Base64.getEncoder().encode(love.getBytes(StandardCharsets.UTF_8));

        String s = new String(encode);//c3VubWluZ2xpYW5neGlodWFuem91ZGk=

        System.out.println(s);
        //jiema
        byte[] decode = Base64.getDecoder().decode(s.getBytes(Charset.defaultCharset()));
        String s1 = new String(decode);

        System.out.println(s1);

    }
}


