package se.lexicon.teri.lesson4;

public class NewCar extends CarBase implements CarColour{
    private final String colour;

    NewCar(String carName, String colour) {
        super(carName);
        this.colour = colour;
    }

    @Override
    public String colour() {
        return colour;
    }
}
