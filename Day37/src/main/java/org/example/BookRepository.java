package org.example;


public class BookRepository {
    public int getBookCount() {
        System.out.println("assume calling real getBookCount() from the database.");
        return 10;
    }
}
