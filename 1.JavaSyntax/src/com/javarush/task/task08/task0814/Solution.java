package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hSet = new HashSet<Integer>();
        for(int i = 0; i < 20; i++){
            hSet.add(i);
        }
        return hSet;
    }

    public static HashSet removeAllNumbersMoreThan10(HashSet set) {
        //напишите тут ваш код
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            if (i>10){
                iterator.remove();
            }
        }

        return set;

    }


    public static void main(String[] args) {
        HashSet<Integer> hSet = createSet();
        removeAllNumbersMoreThan10(hSet);

    }
}
