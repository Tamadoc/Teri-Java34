package se.lexicon.teri.lesson4;

public class Exercises {

    public static void main(String[] args) {

        // Return different messages based on which implementation is called
        Car car = new Car("Ford", "red", 7);
        Vehicle motorbike = new Motorcycle("Yamaha", "black", false);
        Truck truck = new Truck("Volvo", "blue", 2500);

        car.drive();
        motorbike.drive();
        truck.drive();

        // Demonstration of some features of inheritance
        Book meg = new KidsBook("Meg and Mog", "Sara Green", 1985, 25);
        KidsBook bfg = new KidsBook("The BFG", "Roald Dahl", 1979);

        Book goose = new TeenBook("Goosebumps", "Various authors", 1990);
        TeenBook dark = new TeenBook("The Dark Behind the Curtain", "Some Writer", 1988, 215);

        KidsBook.getKidsBooks();
        TeenBook.getTeenBooks();
        TeenBook.findTeenBook("Goosebumps");
        TeenBook.findTeenBook("The Littlest Hobo");

        // Inheritance and interface
        NewCar one = new NewCar("Victor", "green");
        NewCar two = new NewCar("Frosty", "orange");

        System.out.println(one.carName + " is " + one.colour());
        System.out.println(two.carName + " is " + two.colour());
    }
}
