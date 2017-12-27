package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    @Override
    public String getDescription() {

        String text = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),Country.RUSSIA, getCountOfEggsPerMonth());
        return text;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }
}
