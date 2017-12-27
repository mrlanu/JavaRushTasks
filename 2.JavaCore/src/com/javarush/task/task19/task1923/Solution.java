package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()){
            String s = reader.readLine();
            String [] arrS = s.split(" ");

            for (String z : arrS) {
               for (int i = 0; i < z.length(); i++){
                   if (z.charAt(i) >= 48 && z.charAt(i) <= 57){

                       writer.write(z);
                       writer.write(32);
                     //  wr.write(z);
                       break;
                   }
               }
            }

        }
        reader.close();
        writer.close();


    }
}
