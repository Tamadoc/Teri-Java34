package se.lexicon.teri.lesson2;

import java.util.Arrays;

public class Exercise08And09 {

    public static void main(String[] args) {
        // Exercise 8: remove duplicates
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Exercise08And09 exercise = new Exercise08And09();

        System.out.println(Arrays.toString(array));

        // Create and sort a new array of unique numbers, the copy just the first (lowest) number to the output array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        int[] uniqueNumbers = Arrays.copyOf(sortedArray, 1);

        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] > sortedArray[i-1]){
                uniqueNumbers = exercise.addToArray(uniqueNumbers, sortedArray[i]);
            }
        }

        System.out.print("\nNew Array:" + Arrays.toString(uniqueNumbers));
    }

    // Method to "expand" an array (exercise 9)
    public int[] addToArray(final int[] source, int number){
        int[] newArray = Arrays.copyOf(source, source.length + 1);

        newArray[newArray.length - 1] = number;
        return newArray;
    }
}