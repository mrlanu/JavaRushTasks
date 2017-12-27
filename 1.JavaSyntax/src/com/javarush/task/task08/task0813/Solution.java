package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> hSet = new HashSet<String>();
        hSet.add("Лось");
        hSet.add("Лук");
        hSet.add("Лис");
        hSet.add("Лох");
        hSet.add("Лена");
        hSet.add("Лиман");
        hSet.add("Лист");
        hSet.add("Лысый");
        hSet.add("Лен");
        hSet.add("Лик");
        hSet.add("Лайм");
        hSet.add("Лям");
        hSet.add("Лещ");
        hSet.add("Лом");
        hSet.add("Люди");
        hSet.add("Луна");
        hSet.add("Лира");
        hSet.add("Лубянка");
        hSet.add("Латы");
        hSet.add("Лопата");
      //  hSet.add("ло");


        return hSet;
    }

    public static void main(String[] args) {
        HashSet<String> listic = createSet();
       // for(String s : listic)System.out.println(s);
    }
}
