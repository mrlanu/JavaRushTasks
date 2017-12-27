package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int d = 0;
        for(int i=1; i <= 10; i++){
            d = two(i, d);
            System.out.println(d);
        }
    }

    private static int two(int a, int b){
        int c = a + b;
        return c;
    }
}
