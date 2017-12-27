package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/*
Set из котов
*/
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat cat = iterator.next();
            cats.remove(cat);
            break;
        }
        printCats(cats);
    }
    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }
    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat cat = iterator.next();
            System.out.println(cat);
        }
    }
    public static class Cat{
    }
}