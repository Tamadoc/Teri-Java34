package se.lexicon.teri.lesson4;

public class Truck extends Vehicle {
    private int maxLoadWeight;

    Truck(String model, String color, int maxLoadWeight) {
        super(8, model, color);
        this.maxLoadWeight = maxLoadWeight;
    }

    @Override
    public void drive() {
        System.out.println("The truck drives.");
    }
}
