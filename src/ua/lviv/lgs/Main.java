package ua.lviv.lgs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Zoo> mySet = new HashSet<>();
        mySet.add(new Zoo("zebra", 15));
        mySet.add(new Zoo("monkey", 25));
        mySet.add(new Zoo("lion", 6));

        System.out.println("Невідсортований список: ");
        for (Zoo obj : mySet) {
            System.out.println(obj.getAnimal() + " " + obj.getCount());
        }

        Queue<Zoo> myQueue = new PriorityQueue<>(new Comparator<Zoo>() {
            @Override
            public int compare(Zoo o1, Zoo o2) {
                return o1.getAnimal().compareTo(o2.getAnimal());
            }
        });

        for (Zoo obj : mySet) {
            myQueue.add(obj);
        }

        System.out.println("відсортований список: ");
        while (!myQueue.isEmpty()) {
            Zoo obj = myQueue.poll();
            System.out.println(obj.getAnimal() + " " + obj.getCount());
        }
    }
}











