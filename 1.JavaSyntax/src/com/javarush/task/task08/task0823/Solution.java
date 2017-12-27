package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char str[] = s.toCharArray();


        for (int i = 0; i < str.length; i++) {
            //        if(str[i-1] == ' ' || i == 1){
            if(i == 0){
                String Up = Character.toString(str[0]);
                str[0] = Up.toUpperCase().charAt(0);
            }
            else if(str[i-1] == ' ') { // здесь можно устроить разные проверки
                String Up = Character.toString(str[i]);
                str[i] = Up.toUpperCase().charAt(0);
            }

        }

        System.out.println(String.copyValueOf(str));

        //напишите тут ваш код
    }
}
