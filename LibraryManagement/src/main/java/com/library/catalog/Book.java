package com.library.catalog;

public class Book {
    private String bookName;

    private String subject;

    private String publisher;

    private String language;
    private String authorName;

    static protected Integer count = 0;

    public Book(String bookName, String subject, String publisher, String language, String authorName) {
        this.bookName = bookName;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.authorName = authorName;
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
}
