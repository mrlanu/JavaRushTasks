package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).move();
        }
    }

    public void print(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        double max = 0;
        Horse wonHorse = null;

        for (int i = 0; i < horses.size(); i++){
            if (horses.get(i).getDistance() > max){
                max = horses.get(i).getDistance();
                wonHorse = horses.get(i);
            }
        }
        return wonHorse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(new Horse("Vasya",3,0));
        horses.add(new Horse("Petya",3,0));
        horses.add(new Horse("Kolya",3,0));

        game = new Hippodrome(horses);

        try {
            game.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        game.printWinner();

    }
}
