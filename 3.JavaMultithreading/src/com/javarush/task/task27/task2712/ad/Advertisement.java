package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    private Object content;
    private String name;
    private long initialAmount;
    private int hits;
    private int duration;
    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = initialAmount / hits;
    }

    public void revalidate() throws
            UnsupportedOperationException {
        if (getHits() <= 0)
            //throw new UnsupportedOperationException();
            throw new NoVideoAvailableException();
        hits--;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getHits() {
        return hits;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advertisement that = (Advertisement) o;

        if (!content.equals(that.content)) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = content.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "content=" + content +
                ", name='" + name + '\'' +
                ", initialAmount=" + initialAmount +
                ", hits=" + hits +
                ", duration=" + duration +
                ", amountPerOneDisplaying=" + amountPerOneDisplaying +
                '}';
    }
}
