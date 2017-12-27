package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Collections;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;
    private ArrayList<Advertisement> listic;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        listic = (ArrayList) storage.list();
        if (listic.size() == 0) {
            throw new NoVideoAvailableException();
        }

        Collections.sort(listic, (o1, o2) -> {
            int result = Long.compare(o2.getAmountPerOneDisplaying(), o1.getAmountPerOneDisplaying());
            if (result == 0) result = Long.compare(o2.getDuration(), o1.getDuration());
            return result;
        });

        ArrayList<Advertisement> listForShow = getListForShow(new ArrayList<Advertisement>(), timeSeconds, 0);

        StatisticManager.getInstance().register(new VideoSelectedEventDataRow(listForShow, sumMoney(listForShow), sumDuration(listForShow)));

        for (Advertisement ad : listForShow) {
            ConsoleHelper.writeMessage(String.format("%s  is displaying... %d, %d", ad.getName(), ad.getAmountPerOneDisplaying(), ad.getAmountPerOneDisplaying() * 1000 / ad.getDuration()));
            ad.revalidate();
        }
    }

    public int sumDuration(ArrayList<Advertisement> list) {
        int result = 0;
        for (Advertisement ad : list) {
            result = +ad.getDuration();
        }
        return result;
    }

    public long sumMoney(ArrayList<Advertisement> list) {
        long result = 0;
        for (Advertisement ad : list) {
            result = +ad.getAmountPerOneDisplaying();
        }
        return result;
    }


    public ArrayList<Advertisement> getListForShow(ArrayList<Advertisement> list, int timeLeft, int positionToStart) {
        if (positionToStart > listic.size() - 1) return list;
        Advertisement advertisement = listic.get(positionToStart);

        if (!list.contains(advertisement)) {
            if (advertisement.getDuration() <= timeLeft) {
                list.add(advertisement);
                timeLeft -= advertisement.getDuration();
                if (timeLeft <= 0) return list;
                else getListForShow(list, timeLeft, 0);
            } else getListForShow(list, timeLeft, positionToStart + 1);
        } else getListForShow(list, timeLeft, positionToStart + 1);

        return list;
    }
}
