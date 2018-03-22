package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean checkTelNumber(String telNumber) {
        int countNumber = 0;
        int countDash = 0;
        boolean result = false;

        if (telNumber == null)return false;
        if (telNumber == "")return false;

        for (int i = 0; i < telNumber.length(); i++){
            if (telNumber.charAt(i) >= 48 && telNumber.charAt(i) <= 57){
                countNumber++;
            }
            if (telNumber.charAt(i) == 45) {
                countDash++;
                if (i != 0 && telNumber.charAt(i - 1) == 45)return false;
            }
        }
        if (telNumber.startsWith("+") && countNumber == 12 && countDash <= 2){
            result = telNumber.matches("\\+[0-9]*(\\(\\d{3}\\))?[0-9\\-]*\\d");
        }
        if (((telNumber.charAt(0) >= 48 && telNumber.charAt(0) <= 57) || telNumber.startsWith("(")) && countNumber == 10 && countDash <= 2){
            result = telNumber.matches("(\\(\\d{3}\\))?[0-9\\-]*\\d");
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap<com.javarush.task.task20.task2010.Solution.String, Boolean> phones = new HashMap<>();
        phones.put("+380501234567", true);
        phones.put("-38(050)1234567", true);
        phones.put("+38050123-45-67", true);
        phones.put("050123-4567-", true);
        phones.put("+38)050(1234567", false);
        phones.put("+38(050)1-23-45-6-7", false);
        phones.put("050ххх4567", false);
        phones.put("050123456", false);
        phones.put("(0)501234567", false);

        for (Map.Entry<String, Boolean> pair : phones.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue() + " " + checkTelNumber(pair.getKey()));
        }

    }
}
