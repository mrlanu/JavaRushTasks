package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("Khabenyuk", "Serhiy");
        hMap.put("Petrik", "Natalia");
        hMap.put("Zaya", "Sasha");
        hMap.put("Her", "Igor");
        hMap.put("Konyk", "Serhiy");
        hMap.put("Kon", "Lyuba");
        hMap.put("Bychak", "Bogdan");
        hMap.put("Sydor", "Viktor");
        hMap.put("Buyak", "Serhiy");
        hMap.put("Gimno", "Vasyl");


    return hMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String firstName = pair.getValue();
            if(firstName.equals(name))count++;
        }

    return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String secondtName = pair.getKey();
            if(secondtName.equals(lastName))count++;
        }

        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String > mapka = createMap();


    }
}
