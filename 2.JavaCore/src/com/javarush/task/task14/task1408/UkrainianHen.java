package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }

    @Override
    public String getDescription() {
        String text = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),Country.UKRAINE, getCountOfEggsPerMonth());
        return text;
    }
}
