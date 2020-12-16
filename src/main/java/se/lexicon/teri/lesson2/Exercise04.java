package se.lexicon.teri.lesson2;

import java.util.Arrays;

public class Exercise04 {

    public static void main(String[] args) {
        // Exercise 4: copy an array
        int[] numbers = {11, 23, 39, 55, 24, 820};

        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Original:\t" + Arrays.toString(numbers));
        System.out.println("    Copy:\t" + Arrays.toString(copy));
    }
}