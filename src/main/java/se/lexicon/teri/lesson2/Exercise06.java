package se.lexicon.teri.lesson2;

import java.text.DecimalFormat;

public class Exercise06 {

    public static void main(String[] args) {
        // Exercise 6: Calculate average of array values
        double[] forAverage ={43,5,23,17,2,14};
        double total = 0;

        for (int i = 0; i < forAverage.length; i++) {
            total += forAverage[i];
        }

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Average is: " + df.format(total / forAverage.length));
    }
}