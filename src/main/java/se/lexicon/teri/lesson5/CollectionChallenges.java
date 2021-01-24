package se.lexicon.teri.lesson5;

import java.util.*;

public class CollectionChallenges {

    public static void main(String[] args) {
        // Challenge 1: Compare sets and keep common elements (retainAll)
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        List<String> weekend = new ArrayList<>();
        weekend.add("Saturday");
        weekend.add("Sunday");

        weekdays.retainAll(weekend);
        System.out.println("1." + weekdays);

        // Challenge 2: Create new set with keys only
        Map<String, String> addressBook = new HashMap<>();
        addressBook.put("test@gmail.com", "Teri Sandstedt");
        addressBook.put("test@hotmail.com", "Teri Sandstedt");
        addressBook.put("test@mail.com", "Teri Sandstedt");
        addressBook.put("test@yahoo.com", "Teri Sandstedt");
        System.out.println("2." + addressBook);

        List<String> emails = new ArrayList<>(addressBook.keySet());
        System.out.println("2." + emails);

        // Challenge 3:
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero(1, "Hair Shampoo Advert Girl", 22));
        superHeroes.add(new SuperHero(2, "Indecisive Man", 35));
        superHeroes.add(new SuperHero(3, "Spaghetti Woman", 28));
        superHeroes.add(new SuperHero(4, "Magnet Boy", 12));
        superHeroes.sort(null);

        for (SuperHero hero : superHeroes) {
            System.out.println("3." + hero.toString());
        }

        // Challenge 4:
        Integer[] numbers = {1, 4, 4, 2, 6, 7, 6, 7, 7};
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        numberList.sort(null);

        for (int i = 0; i < numberList.size(); i++) {
            if (i == numberList.size() - 1 || numberList.get(i) != numberList.get(i + 1)) {
                System.out.println(" " + numberList.get(i));
            }
        }
    }
}


class SuperHero implements Comparable<SuperHero> {
    int id;
    String name;
    int age;

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(SuperHero hero) {
        if (age < hero.age) {
            return -1;
        } else if (age == hero.age) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "SuperHero " + id + ": " + name + " is " + age + " years old.";
    }
}