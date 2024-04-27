package com.book.library.service;

import com.book.library.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);

    String insertBook(Book book);

    void updateBook(Long id, Book book);

    void deleteBookById(Long id);
}
