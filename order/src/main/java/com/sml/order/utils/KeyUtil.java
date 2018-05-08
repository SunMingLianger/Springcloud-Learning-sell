package com.sml.order.utils;

import java.util.Random;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:30
 */
public class KeyUtil
{
    /**
     * unique key
     */
    public static synchronized String generateKey()
    {
        Random random = new Random();
        Integer num = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
