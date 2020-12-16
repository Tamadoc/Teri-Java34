package se.lexicon.teri.lesson2;

public class Exercise07 {

    public static void main(String[] args) {
        // Exercise 7: print odd numbers
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.print("\nOdd Array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.print(" " + array[i]);
            }
        }
    }
}