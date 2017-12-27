package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human("Misyo", true, 14);
        Human child2 = new Human("Katya", false, 8);
        Human child3 = new Human("Olha", false, 10);

        ArrayList<Human> grandChilds = new ArrayList<Human>();
        grandChilds.add(child1);
        grandChilds.add(child2);
        grandChilds.add(child3);

        Human papa = new Human("Papa", true, 38, grandChilds);
        Human mama = new Human("Mama", false, 38, grandChilds);

        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(papa);

        ArrayList<Human> childsM = new ArrayList<Human>();
        childsM.add(mama);

        Human grandPa = new Human("Ded1", true, 62, childs);
        Human grandPa2 = new Human("Ded2", true, 62, childsM);
        Human grandMa = new Human("Baba1", false, 62, childs);
        Human grandMa2 = new Human("Baba2", false, 62, childsM);

        ArrayList<Human> human = new ArrayList<Human>();
        human.add(grandPa);
        human.add(grandMa);
        human.add(grandPa2);
        human.add(grandMa2);
        human.add(papa);
        human.add(mama);
        human.add(child1);
        human.add(child2);
        human.add(child3);


        for (int i = 0; i < human.size(); i++) {
            System.out.println(human.get(i));
        }
    }


    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
