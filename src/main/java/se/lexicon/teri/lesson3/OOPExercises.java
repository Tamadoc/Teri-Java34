package se.lexicon.teri.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class OOPExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        // Exercise 1: Drive an OOP Car
        Car car1 = new Car("1234", 2020, "Volvo", "green", 1.2);
        car1.drive();

        // Exercise 2: Print area of a rectangle
        Rectangle rectangle = new Rectangle();
        System.out.print("Height > ");
        rectangle.setHeight(scanner.nextDouble());
        System.out.print("Width > ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("Area is " + rectangle.getArea());

        // Exercise 3: Relationship between classes
        // Create test data
        Author au1 = new Author(1, "Teri", "Sandstedt");
        Author au2 = new Author(2, "Katharine", "Kerr");
        Author au3 = new Author(3, "Isaac", "Asimov");
        Author au4 = new Author(4, "J. R. R.", "Tolkien");
        Book bk1 = new Book(1, "Lord of the Rings", au4);
        Book bk2 = new Book(2, "Ringworld", au3);
        Book bk3 = new Book(3, "Dawnspell", au2);
        Book bk4 = new Book(4, "Snare", au2);

        // add books to book array
        BookData library = new BookData();
        library.addBook(bk1);
        library.addBook(bk2);
        library.addBook(bk3);
        library.addBook(bk4);

        // Print specific books
        library.printAuthorByBook(bk1);
        library.printBooksByLastName(au1.getLastName());
        library.printBooksByLastName("Kerr");
    }
}


class Car {
    private String id;
    private int year;
    private String model;
    private String color;
    private double motorSize;

    Car(String id, int year, String model, String color, double motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(double motorSize) {
        this.motorSize = motorSize;
    }

    public void drive() {
        System.out.println(model + " with " + motorSize + "L motor is driving.");
    }
}


class Rectangle {
    private double height;
    private double width;

    //Constructors
    Rectangle() {
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }
}


class Author {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books = new Book[0];

    Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


class Book {
    private int id;
    private String title;
    private Author author;

    Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}


class BookData {
    private Book[] books = new Book[0];

    public void addBook(Book book) {
        Book[] tempBookArray = Arrays.copyOf(books, books.length + 1);
        tempBookArray[tempBookArray.length - 1] = book;
        books = tempBookArray;
    }

    public void printAuthorByBook(Book book) {
        System.out.println(book.getTitle() + " by " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
    }

    public void printBooksByLastName(String lastName) {
        Book[] results = new Book[0];
        for (Book book : books) {
            if (book.getAuthor().getLastName().equals(lastName)) {
                results = Arrays.copyOf(results, results.length + 1);
                results[results.length - 1] = book;
            }
        }
        if (results.length > 1) {
            for (Book result : results) {
                System.out.println(result.getTitle());
            }
        } else {
            System.out.println("No books by that author");
        }
    }
}
