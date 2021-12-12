package com.tav.bookstore.model;

public class BookStore {
    // The booksInStock property should be a hashmap of key: String, value: Integer

    public BookStore() {
        throw new RuntimeException(
                "Please implement the BookStore class with the following properties: booksInStock, cashInRegistry" +
                        " and the following methods:" +
                        "purchase(title, amount) (If there aren't enough books to purchase, throw an OutOfStockException)" +
                        "fillStock(title, amount)"
        );
    }
}
