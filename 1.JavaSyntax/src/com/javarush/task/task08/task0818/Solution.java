package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put("Khabenyuk", 600);
        hMap.put("Konyuk", 300);
        hMap.put("Bychak", 400);
        hMap.put("Sydor", 100);
        hMap.put("Gnida", 550);
        hMap.put("Vasya", 1000);
        hMap.put("Dorosh", 900);
        hMap.put("Buyak", 150);
        hMap.put("Steliha", 300);
        hMap.put("Shpynda", 600);

        return hMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            HashMap.Entry pair = (HashMap.Entry) iterator.next();
            Integer salary = (Integer) pair.getValue();
            if (salary < 500)iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}