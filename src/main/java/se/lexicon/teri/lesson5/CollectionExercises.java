package se.lexicon.teri.lesson5;

import java.util.*;

public class CollectionExercises {

    public static void main(String[] args) {

        // Exercise 1: Create and print list
        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("1." + weekdays);

        // Exercise 2: iterate through the list
        for (String day : weekdays) {
            System.out.println("2." + day);
        }

        // Exercise 3: Add item to list
        List<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        System.out.println("3a." + week);
        week.add(3, "Thursday");
        System.out.println("3b." + week);

        // Exercise 4: Create a sublist
        List<String> shortlist = weekdays.subList(0, 3);
        System.out.println("4." + shortlist);

        // Exercise 5: Create a hashset
        HashSet<String> weekSet = new HashSet<>();
        weekSet.add("Monday");
        weekSet.add("Tuesday");
        weekSet.add("Wednesday");
        weekSet.add("Thursday");
        weekSet.add("Friday");
        weekSet.add("Saturday");
        weekSet.add("Sunday");
        System.out.println("5." + weekSet);

        // Exercise 6: Convert hashset to arraylist
        List<String> newList = new ArrayList<>();
        Iterator<String> iterator1 = weekSet.iterator();
        while (iterator1.hasNext()) {
            newList.add(iterator1.next());
        }
        System.out.println("6." + newList);

        // Exercise 7: Convert hashset to arraylist, then order alphabetically
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("Harry");
        nameSet.add("Dumbeldore");
        nameSet.add("Hermione");
        nameSet.add("Minerva");
        nameSet.add("Hagrid");
        nameSet.add("Draco");
        nameSet.add("Ron");
        System.out.println("7a." + nameSet);

        List<String> nameList = new ArrayList<>(nameSet);  // Conversion of nameSet to ArrayList
        nameList.sort(Comparator.naturalOrder());  // Or Collections.sort(nameList);
        System.out.println("7b." + nameList);

        // Exercise 8: Sort names using Set or child of Set
        Set<String> treeSetNames = new TreeSet<>();
        treeSetNames.add("Elm");
        treeSetNames.add("Alder");
        treeSetNames.add("Oak");
        treeSetNames.add("Elderberry");
        treeSetNames.add("Pine");
        System.out.println("8." + treeSetNames);

        // Exercise 9: Create a hashMap
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(1, "Volvo");
        carMap.put(2, "Ford");
        carMap.put(3, "Citroen");
        carMap.put(4, "Ferrari");
        System.out.println("9." + carMap);

        // Exercise 10: Print hashMap keys
        System.out.println("10." + carMap.keySet());

        // Exercise 11: Print hashMap keys
        System.out.println("11." + carMap.values());

        // Exercise 12: Create hashMap of Car objects
        Car car1 = new Car(1, "Ford","Prefect");
        Car car2 = new Car(2, "Renault","Clio");
        Car car3 = new Car(3, "Ford","Anglia");
        Car car4 = new Car(4, "Volvo","360");
        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);
        cars.put(4, car4);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("12." + cars.get(i + 1).getBrand());
        }
    }
}

class Car {
    int id;
    String brand;
    String model;

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }
}
