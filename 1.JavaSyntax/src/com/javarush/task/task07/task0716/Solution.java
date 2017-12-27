package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        //list = fix(list);
        System.out.println(list.size());
        System.out.println(list.get(0).length());

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i = 0; i < 3; i++){
            boolean r = false, l = false;

            for (int j = 0; j < 4; j++){

                Character x = list.get(i).charAt(j);
                if(x == 'р')r = true;
                if(x == 'л')l = true;
            }

            if(r == true && l == true)continue;
                else {
                    if(r == true)list.remove(i);
                    if(l == true)list.add(list.get(i));
                }


        }
       // System.out.println(list.get(0).length());
        return list;
    }
}