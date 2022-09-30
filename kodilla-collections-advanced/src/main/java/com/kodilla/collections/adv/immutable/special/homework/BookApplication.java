package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("Czara ognia", "Rowling");
        Book book2 = BookManager.createBook("Tomcio Paluszek", "Nieznany");
        Book book3 = BookManager.createBook("Ogniem i mieczem", "Sienkiewicz");
        Book book4 = BookManager.createBook("Ogniem i mieczem", "Sienkiewicz");
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3); // nie sa takie same
        System.out.println(book4);
    }
}
