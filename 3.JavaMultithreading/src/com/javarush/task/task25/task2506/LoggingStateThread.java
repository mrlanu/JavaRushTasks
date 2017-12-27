package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{

    Thread thread;

    public LoggingStateThread(Thread t) {
        this.thread = t;
    }

    @Override
    public void run() {
        Thread.State currentState = thread.getState();
        System.out.println(currentState);
        while (currentState != State.TERMINATED) {
            Thread.State newState = thread.getState();
            if (newState != currentState) {
                System.out.println(newState);
                currentState = newState;
            }
        }
        this.interrupt();
    }
}
