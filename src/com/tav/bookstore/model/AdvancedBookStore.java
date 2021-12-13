package com.tav.bookstore.model;


public class AdvancedBookStore {
    // The booksInStock property should be a hashmap of key: String, value: List<Book>

    public AdvancedBookStore() {
        throw new RuntimeException(
                "Please implement the AdvancedBookStore class with a 'booksInStock' property and the following methods:" +
                        "purchase(title, amount) (If there aren't enough books to purchase, throw an OutOfStockException)" +
                        "fillStock(book, amount) (Filling the stock costs the store money, 30% of the original book price)"
        );
    }
}
