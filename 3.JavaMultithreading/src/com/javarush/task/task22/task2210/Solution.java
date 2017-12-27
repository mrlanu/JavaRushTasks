package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter)
    {
        int i = 0;

        StringTokenizer sTok = new StringTokenizer(query, delimiter);
        int count = sTok.countTokens();
        String [] result = new String[count];

        while (sTok.hasMoreTokens()){
            result [i] = sTok.nextToken();
            i++;
        }
        return result;
    }
}
