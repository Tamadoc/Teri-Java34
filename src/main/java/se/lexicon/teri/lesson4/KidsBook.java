package se.lexicon.teri.lesson4;

import java.util.Arrays;

public class KidsBook extends Book {
    private static KidsBook[] kidsBooks = new KidsBook[0];

    KidsBook(String title, String author, int year) {
        super(title, author, "Child", year);
        addKidsBook();
    }

    KidsBook(String title, String author, int year, int pages) {
        super(title, author, "Child", year, pages);
        addKidsBook();
    }

    private void addKidsBook() {
        kidsBooks = Arrays.copyOf(kidsBooks, kidsBooks.length + 1);
        kidsBooks[kidsBooks.length - 1] = this;
    }

    public static void getKidsBooks() {
        for (KidsBook kidsBook : kidsBooks) {
            System.out.println(kidsBook.toString());
        }
    }
    @Override
    public String toString() {
        String details = title + " by " + author + ": " + publicationYear + ", " + pages + " pages.";
        return details;
    }
}
