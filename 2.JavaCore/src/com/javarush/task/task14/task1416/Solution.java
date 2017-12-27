package com.javarush.task.task14.task1416;

/* 
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    static interface Walkable {
        void walk();
    }

    static interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal implements Swimmable{
        Swimmable getCurrentAnimal(){
            return new Orca();
        }

        public void swim(){

        }
    }

    static class Whale extends OceanAnimal implements Swimmable{
        Swimmable getCurrentAnimal(){
            return new Whale();
        }

        public void swim(){

        }

    }

    static class Otter implements Swimmable, Walkable{
       public void swim(){

       }

       public void walk(){

       }

    }
}
