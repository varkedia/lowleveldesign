package com.library.catalog;

public class BookItem extends Book{
    private Integer bookId;
    private BookStatus status;

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public BookItem(String bookName, String subject, String publisher, String language, String authorName) {
        super(bookName, subject, publisher, language, authorName);
        bookId = count++;
        status = BookStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        if(status==BookStatus.AVAILABLE)
            return true;
        return false;
    }
}
