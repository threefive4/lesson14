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

        Set<Zoo> sortedByAnimalSet = new HashSet<>();
        sortedByAnimalSet.addAll(mySet);
        System.out.println("sorted by animal name: ");
        for (Zoo zoo : sortedByAnimalSet) {
            System.out.println(zoo);
        }
        Set<Zoo> sortedByCountSet = new TreeSet<Zoo>();
        sortedByCountSet.addAll(mySet);
        System.out.println("Zoo set sorted by count:");
        for (Zoo zoo : sortedByCountSet) {
            System.out.println(zoo);
        }


    }
}











