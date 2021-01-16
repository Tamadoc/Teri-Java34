package se.lexicon.teri.lesson4;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    Motorcycle(String model, String color, boolean hasSidecar) {
        super(8, model, color);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle drives.");
    }
}
