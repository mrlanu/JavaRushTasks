package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static int max = 0;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = initializeArrList();
        searchMax(list);
    }

    public static ArrayList<String> initializeArrList()throws IOException{
        ArrayList<String> listic = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            listic.add(s);
            if(s.length() > max)max = s.length();
        }
        return listic;
    }

    public static void searchMax(ArrayList<String> lis){

        for(int i = 0; i < lis.size(); i++){
            if(max == lis.get(i).length())System.out.println(lis.get(i));
        }
    }
}
