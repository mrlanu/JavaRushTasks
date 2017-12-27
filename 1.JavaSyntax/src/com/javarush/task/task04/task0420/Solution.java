package com.javarush.task.task04.task0420;
/* 
Сортировка трех чисел
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int c = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max, mid, min;
        if(a > b) {
          if(a > c) {
                    if(b > c) {max = a; mid = b; min = c;}
                    else {max = a; mid = c; min = b;}}
          else {
                    if(b > c) {max = b; mid = c; min = a;}
                    else {max = c; mid = a; min = b;}}}

        else {
            if(a < c) {
                if(b > c) {max = b; mid = c; min = a;}
                else {max = c; mid = b; min = a;}}
            else {if(b > c) {max = b; mid = a; min = c;}
                  else {max = b; mid = a; min = c;}}
        }
        System.out.println(max + " " + mid + " " + min);
    }
}
