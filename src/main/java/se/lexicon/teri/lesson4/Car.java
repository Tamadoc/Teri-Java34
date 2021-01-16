package se.lexicon.teri.lesson4;

public class Car extends Vehicle {
    private int noOfSeats;

    Car(String model, String color, int noOfSeats) {
        super(2, model, color);
        this.noOfSeats = noOfSeats;
    }


    @Override
    public void drive() {
        System.out.println("The car drives.");
    }
}
