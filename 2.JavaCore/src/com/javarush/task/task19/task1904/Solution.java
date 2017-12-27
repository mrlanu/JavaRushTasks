package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException {

            String[] s = fileScanner.nextLine().split(" ");
            Date date = new GregorianCalendar(Integer.parseInt(s[5]), Integer.parseInt(s[4]) - 1, Integer.parseInt(s[3])).getTime();
            return new Person(s[1], s[2], s[0], date);
        }
    }
}
