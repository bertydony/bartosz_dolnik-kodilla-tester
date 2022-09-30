package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();
    public static Book createBook(String title, String author) {
        for(int i = 0; books.size() > i; i++){
           Book temp = books.get(i);
            if(temp.getTitle().equals(title) && temp.getAuthor().equals(author)){
                System.out.println("Taka ksiazka juz istnieje");
                return temp;
            }
        }
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }
}
