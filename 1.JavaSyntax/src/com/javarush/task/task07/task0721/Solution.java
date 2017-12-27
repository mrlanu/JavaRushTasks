package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;
        boolean shlyuz = true;

        int [] list = new int[20];

        for(int i = 0; i < 20; i++){
            list[i] = Integer.parseInt(reader.readLine());
            if(shlyuz){
                maximum = list[i];
                minimum = list[i];
                shlyuz = false;
            }
            else {
                if(list[i] > maximum)maximum = list[i];
                if(list[i] < minimum)minimum = list[i];
            }
        }


        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
