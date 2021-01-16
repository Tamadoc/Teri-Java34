package se.lexicon.teri.lesson4;

public class Book {
    String title;
    String author;
    String category;
    int publicationYear;
    int pages;

    Book() {
        pages = 100;
    }

    Book(String title, String author, String category, int publicationYear) {
        this();
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationYear = publicationYear;
    }

    Book(String title, String author, String category, int publicationYear, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }
}
