package com.shinley.designpattern.strategy;

public class Cat implements Comparable{
    private int height;
    private int weight;

    private Comparator comparator;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    /**
     *
     * @param o
     * @return
     */
    public int compareTo(Object o) {
        return comparator.compare(this, o);
    }
}
