package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/
public class Solution extends Thread {

    Thread.UncaughtExceptionHandler myHandler = new MyUncaughtExceptionHandler();

    public Solution() {
        this.setUncaughtExceptionHandler(myHandler);
    }

    public static void main(String[] args) {
    }

    public static class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
        @Override
        public void uncaughtException(Thread t, Throwable e) {

            if (e instanceof Error)
            {
                System.out.println ("Нельзя дальше работать");
            }
            else if (e instanceof Exception)
            {
                System.out.println ("Надо обработать");
            }
            else if (e instanceof Throwable)
            {
                System.out.println ("ХЗ");
            }
        }
    }
}
