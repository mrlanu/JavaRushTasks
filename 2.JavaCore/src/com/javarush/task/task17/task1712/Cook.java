package com.javarush.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || !Manager.getInstance().getOrderQueue().isEmpty()) {
            try {
                synchronized (this) {
                    if (!Manager.getInstance().getOrderQueue().isEmpty()) {
                        cooking();
                    }
                }
                if (continueWorking && Manager.getInstance().getOrderQueue().isEmpty()) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private void cooking() throws InterruptedException {

        Order order = Manager.getInstance().getOrderQueue().poll();      // повар берет заказ из очереди
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готовим блюдо
        Dishes dishes = new Dishes(order.getTableNumber());       //  это готовое блюдо
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
        Manager.getInstance().getDishesQueue().add(dishes);
    }
}
