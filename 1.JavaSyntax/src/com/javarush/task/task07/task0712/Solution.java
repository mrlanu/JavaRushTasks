package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int minString = 1000, maxString = 0;
        boolean vorotaOpen = true;

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
            if(vorotaOpen == true){
                minString = list.get(i).length();
                maxString = 0;
                vorotaOpen = false;
            }

            if(list.get(i).length() > maxString)maxString = list.get(i).length();
            if(list.get(i).length() < minString)minString = list.get(i).length();
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == maxString){
                System.out.println(list.get(i));
                break;
            }
            if(list.get(i).length() == minString){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
