package se.lexicon.teri.lesson2;

import java.util.Arrays;

public class Exercise03 {

    public static void main(String[] args) {
        // Exercise 3: sort an array
        String[] cities = {"Sydney", "London", "Växjö", "Stockholm", "Paris", "Älmhult", "Aberdeen"};

        System.out.println("Unsorted Array:\t" + Arrays.toString(cities));

        Arrays.sort(cities);

        System.out.println("  Sorted Array:\t" + Arrays.toString(cities));
    }
}