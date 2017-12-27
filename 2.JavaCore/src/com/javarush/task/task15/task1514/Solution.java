package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put((double)1,"vasya");
        labels.put((double)2,"kolya");
        labels.put((double)3,"petya");
        labels.put((double)4,"ivanka");
        labels.put((double)5,"grisha");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
