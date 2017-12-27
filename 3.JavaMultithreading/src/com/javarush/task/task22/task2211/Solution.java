package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream fI = new FileInputStream(args[0]);
        FileOutputStream fO = new FileOutputStream(args[1]);

       // Charset utf8 = Charset.forName("UTF-8");
       // Charset windows1251 = Charset.forName("Windows-1251");

        byte[] buffer = new byte[fI.available()];
             fI.read(buffer);
            String s = new String(buffer, "UTF-8");

            fO.write(s.getBytes("Windows-1251"));

        fI.close();
        fO.close();
    }
}
