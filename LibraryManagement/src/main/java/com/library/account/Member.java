package com.library.account;

import com.library.catalog.BookItem;
import com.library.catalog.BookStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends Account{
    private static final int MAX_BOOKS = 5;
    private Date joinDate;

    private List<BookItem> issuedBooks;

    public Member(String userName, String password) {
        super(userName, password);
        joinDate = new Date();
        issuedBooks = new ArrayList<>();
    }

    public List<BookItem> getIssuedBooks() {
        return issuedBooks;
    }

    public boolean issueBook(BookItem book){
        if(canIssueBook() && book.isAvailable()){
            issuedBooks.add(book);
            book.setStatus(BookStatus.ISSUED);
            return true;
        }
        return false;
    }

    private boolean canIssueBook() {
        if(issuedBooks.size()<MAX_BOOKS)
            return true;
        return false;
    }


    public void returnBook(BookItem book){
        issuedBooks.remove(book);
        book.setStatus(BookStatus.AVAILABLE);
    }

}
