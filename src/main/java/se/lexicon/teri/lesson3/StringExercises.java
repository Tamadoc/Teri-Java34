package se.lexicon.teri.lesson3;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {

//  Working with Strings
//  1. What is the length of the String: "Java" ?
        String java = "Java";
        System.out.println("What is the length of the String: \"Java\"? " + java.length());

//  2. What char is at index position 6 in the following String:
//      "Long example sentence" ?
        String longExample = "Long example sentence";
        System.out.println("Index 6 of \"Long example sentence\" is: " + longExample.charAt(6));

//  3. What is the index position of 'o' in the following String:
//      "Even longer example sentence" ?
        String longerExample = "Even longer example sentence";
        System.out.println("Index of 'o' in \"Even longer example sentence\" is: " + longerExample.indexOf('o'));

//  4. Given the following String: "Ok this is not as long!"
//      create a substring of only "not as long" (excluding the
//      exclamation point) and print it out.
        String subStringEx = "Ok this is not as long!";
        System.out.println("Substring of \"" + subStringEx + "\" is: " + subStringEx.subSequence(11,
                subStringEx.length() - 1));

//  5. Convert the following String: "CAPS EQUALS SCREAMING" to
//      lowercase and print it out. Then convert it back to
//      uppercase and print it out again.
        String caseChange = "CAPS EQUALS SCREAMING";
        System.out.println(caseChange.toLowerCase());
        System.out.println(caseChange.toUpperCase());

//  6. Correct the following String: "Java is the worst
//      programming language!" by replacing the (obviously
//      incorrect) word "worst" with the word "best". Then print
//      out the sentence.
        String wrongString = "Java is the worst programming language!";
        String correctString = wrongString.replace("worst", "best");
        System.out.println(correctString);

//  7. What is the output of the following String:
//      "\tJ\ta\tv\ta\t" after you trim it?
        String untrimmed = "\tJ\ta\tv\ta\t";
        String trimmed = untrimmed.trim();
        System.out.println(trimmed);

//  8. Parse the following int: 20 to a String and add a 20 to the
//      end of the String. Printing it out should return: "2020".
        int twentyInt = 20;
        String twentyString = Integer.toString(twentyInt);
        System.out.println(twentyString + 20);

//  9. Oil and water don't go well together. Given the String:
//      "Oil and Water", split them up into the words "Oil","Water"
//      and store them in a String array.
        String oilAndWater = "Oil and Water";
        String[] newArray = oilAndWater.split(" and ");
        System.out.println(Arrays.toString(newArray));

//  10. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
//      into an array. Print out all names separately.
        String namesString = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = namesString.split(",");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

//  11. Convert the following String: "ThisShouldBeConverted" to
//      a char array. Iterate through the char array and print out
//      each element.
        String toConvert = "ThisShouldBeConverted";
        char[] charArray = toConvert.toCharArray();
        for (char character : charArray) {
            System.out.print(character + " ");
        }
        System.out.println();

//  12. Convert the following char[]: {'J','a','v','a'} to a
//      String and print it out.
        char[] javaCharacters = {'J','a','v','a'};
        String javaString = new String(javaCharacters);
        System.out.println(javaString);
    }
}
