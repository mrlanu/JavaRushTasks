package com.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        while (continueWorking || !Manager.getInstance().getDishesQueue().isEmpty()) {
            if (!Manager.getInstance().getDishesQueue().isEmpty()) {       //относим готовый заказ
                Dishes dishes = Manager.getInstance().getDishesQueue().poll();
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = Manager.getInstance().getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                Manager.getInstance().getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
