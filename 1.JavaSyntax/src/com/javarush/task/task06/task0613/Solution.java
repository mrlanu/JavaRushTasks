package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        for(int i = 1; i <= 10; i++){
            new Cat();
        }
        System.out.println(Cat.catCount);

        //выведи значение переменной catCount
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;

        public Cat(){
            catCount++;
        }

        //создай конструктор
    }
}
