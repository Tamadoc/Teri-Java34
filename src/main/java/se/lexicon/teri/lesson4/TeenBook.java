package se.lexicon.teri.lesson4;

import java.util.Arrays;

public class TeenBook extends Book{
    private static TeenBook[] teenBooks = new TeenBook[0];

    TeenBook(String title, String author, int year) {
        super(title, author, "Teen", year);
        addTeenBook();
    }

    TeenBook(String title, String author, int year, int pages) {
        super(title, author, "Teen", year, pages);
        addTeenBook();
    }

    private void addTeenBook() {
        teenBooks = Arrays.copyOf(teenBooks, teenBooks.length + 1);
        teenBooks[teenBooks.length - 1] = this;
    }

    public static void getTeenBooks() {
        for (TeenBook teenBook : teenBooks) {
            System.out.println(teenBook.toString());
        }
    }

    public static void findTeenBook(String title) {
        String found = "Book does not exist.";
        for (TeenBook teenBook : teenBooks) {
            if (teenBook.title == title) {
                found = "Found: " + teenBook.toString();
            }
        }
        System.out.println(found);
    }

    @Override
    public String toString() {
        String details = title + " by " + author + ": " + publicationYear + ", " + pages + " pages.";
        return details;
    }
}
