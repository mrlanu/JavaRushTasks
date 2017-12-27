package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.text.SimpleDateFormat;
import java.util.*;

public class StatisticManager{

    private StatisticStorage statisticStorage = new StatisticStorage();
    private static StatisticManager ourInstance = new StatisticManager();
    private Set<Cook> cooks = new HashSet<>();

    private StatisticManager(){}

    public static StatisticManager getInstance() {
        return ourInstance;
    }

    public void register(EventDataRow data){
            statisticStorage.put(data);
    }

    public void register(Cook cook){
        cooks.add(cook);
    }

    public Map<Date, Map<String, Double>> cookJopDonePerDay(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<EventType, List<EventDataRow>> storageMap = statisticStorage.getStorage();
        Map<String, Map<String, Double>> result = new HashMap<>();
        List<EventDataRow> listRow = new ArrayList<>(storageMap.get(EventType.COOKED_ORDER));
        for (EventDataRow x: listRow){
            CookedOrderEventDataRow date = (CookedOrderEventDataRow) x;
            if (!result.containsKey(format.format(date.getDate()))) {
                Map<String, Double> coocWork = new TreeMap<>();
                coocWork.put(date.getCookName(), (double)date.getTime());
                result.put(format.format(date.getDate()), coocWork);
            }else {
                Map<String, Double> coocWork = result.get(format.format(date.getDate()));
                if (!coocWork.containsKey(date.getCookName())) {
                    coocWork.put(date.getCookName(), (double) date.getTime());
                    result.put(format.format(date.getDate()), coocWork);
                }
                else {
                    double sum = coocWork.get(date.getCookName())+date.getTime();
                    coocWork.put(date.getCookName(),sum);
                    result.put(format.format(date.getDate()), coocWork);
                }
            }
        }
        Map<Date, Map<String, Double>> result1 = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Map<String, Double>> s: result.entrySet()) {
            result1.put(new Date(s.getKey()), s.getValue());
        }
        return result1;
    }

    //посчитает общую прибыль за каждый день.
    public Map<Date, Double> profitPerDey() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<EventType, List<EventDataRow>> storageMap = statisticStorage.getStorage();
        List<EventDataRow> storeList = storageMap.get(EventType.SELECTED_VIDEOS);
        Map<String, Double> result = new TreeMap<>(Collections.reverseOrder());
        String date = null;
        double count = 0;
        for (EventDataRow s: storeList) {
            //double count = 0;
            if (date==null)date= format.format(s.getDate());
            if (date.equals(format.format(s.getDate())))
                count += ((VideoSelectedEventDataRow) s).getAmount();
            else {
                count = 0;
                date = format.format(s.getDate());
            }
            result.put(date, count);
        }
        Map<Date, Double> result1 = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Double> s: result.entrySet()) {
            result1.put(new Date(s.getKey()), s.getValue());
        }
        return result1;
    }

    private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            EventType[] eventTypes = EventType.values();
            for (int i = 0; i < eventTypes.length; i++) {
                storage.put(eventTypes[i], new ArrayList<EventDataRow>());
            }
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }

        private void put(EventDataRow data){

            storage.get(data.getType()).add(data);

        }

    }
}
