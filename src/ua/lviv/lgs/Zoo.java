package ua.lviv.lgs;

import java.util.Comparator;

public class Zoo implements Comparable<Zoo> {
    private String animal;
    private int count;

    @Override
    public String toString() {
        return "Zoo{" +
                "animal='" + animal + '\'' +
                ", count=" + count +
                '}';
    }

    public Zoo(String animal, int count) {
        this.animal = animal;
        this.count = count;
    }

    public String getAnimal() {
        return animal;

    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static Comparator<Zoo> getComparatorByAnimal() {
        return ComparatorByAnimal;
    }

    public static void setComparatorByAnimal(Comparator<Zoo> comparatorByAnimal) {
        ComparatorByAnimal = comparatorByAnimal;
    }


    @Override
    public int compareTo(Zoo other) {
        int result = Integer.compare(count, other.count);
        if (result == 0) {
            result = animal.compareTo(other.animal);
        }
        return result;
    }

    public static Comparator<Zoo> ComparatorByAnimal = new Comparator<Zoo>() {
        @Override
        public int compare(Zoo obj1, Zoo obj2) {
            return obj1.getAnimal().compareTo(obj2.getAnimal());
        }
    };
}


