package com.javarush.task.task05.task0528;
import java.util.Date;
import java.text.*;
/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat fd = new SimpleDateFormat("dd MM yyyy");
        System.out.println(fd.format(date));
    }
}
