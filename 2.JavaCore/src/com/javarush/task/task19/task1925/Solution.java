package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sBuild = new StringBuilder();
        while (reader.ready()){
            String s = reader.readLine();
            String [] arrS = s.split(" ");

            for (String z : arrS) {
                    if (z.length() > 6){
                        sBuild.append(z);
                        sBuild.append(",");
                    }
            }
        }
        sBuild.deleteCharAt(sBuild.length()-1);
        writer.write(String.valueOf(sBuild));
        reader.close();
        writer.close();
    }
}
