package com.library;

import com.library.account.Account;
import com.library.account.Librarian;
import com.library.account.Member;
import com.library.catalog.Book;
import com.library.catalog.BookItem;

public class Driver {
    public static void main(String[] args) {
        Librarian lib = new Librarian("vkedia", "");
        Member member = new Member("vshivam", "");
        BookItem harryPorter = new BookItem("HarryPorter", "JKRowling","","","");
        System.out.println(member.issueBook(harryPorter));
        System.out.println(harryPorter.getStatus());
        System.out.println(member.getIssuedBooks().size());
    }
}
