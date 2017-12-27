package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    public String getDescription() {
        String text = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),Country.BELARUS, getCountOfEggsPerMonth());

        return text;
    }
}
