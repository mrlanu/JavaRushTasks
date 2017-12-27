package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class DirectorTablet {

    StatisticManager manager = StatisticManager.getInstance();

    public void printAdvertisementProfit(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<Date, Double> advertisementProfitList = manager.profitPerDey();
//        advertisementProfitList.put(new Date(new Date().getYear(),4,28),new Double(300));
//        advertisementProfitList.put(new Date(new Date().getYear(),4,23),new Double(300));
//        advertisementProfitList.put(new Date(new Date().getYear(),4,21),new Double(300));
//        advertisementProfitList.put(new Date(new Date().getYear(),4,29),new Double(300));
//        advertisementProfitList.put(new Date(new Date().getYear(),4,24),new Double(300));
        double total = 0;
        for (Map.Entry<Date, Double> s: advertisementProfitList.entrySet()) {
            ConsoleHelper.writeMessage(format.format(s.getKey())+" - "+s.getValue()/100);
            total+=s.getValue()/100;
        }
        ConsoleHelper.writeMessage("Total - "+total);
    }
    //Разпечатка нагрузки поваров минут в день
    public void printCookWorkloading(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<Date, Map<String, Double>> dateMap = manager.cookJopDonePerDay();

//        Map<String, Double> map1 = new TreeMap<>(Collections.reverseOrder());
//        map1.put("Ivanov", (double) 480);
//        map1.put("Petrov", (double) 1375);
//        map1.put("Mozg", (double) 1158);
//
//        Map<String, Double> map2 = new TreeMap<>(Collections.reverseOrder());
//        map2.put("Svanov", (double) 480);
//        map2.put("Getrov", (double) 1375);
//        map2.put("Aozg", (double) 1158);
//
//        Map<String, Double> map3 = new TreeMap<>(Collections.reverseOrder());
//        map3.put("Svanov", (double) 480);
//        map3.put("Getrov", (double) 1375);
//        map3.put("Aozg", (double) 1158);
//
//        dateMap.put((new Date(new Date().getYear(),4,28)),map1);
//        dateMap.put((new Date(new Date().getYear(),4,29)),map2);
//        dateMap.put((new Date(new Date().getYear(),4,27)),map2);
        for (Map.Entry<Date,Map<String, Double>> s: dateMap.entrySet()) {
            ConsoleHelper.writeMessage(format.format(s.getKey()));
            for (Map.Entry<String, Double> x: s.getValue().entrySet()) {
                ConsoleHelper.writeMessage(x.getKey()+" - "+Math.round(x.getValue()/60)+" min");
            }
            ConsoleHelper.writeMessage("");
        }
    }
    public void printActiveVideoSet(){}
    public void printArchivedVideoSet(){}
}
