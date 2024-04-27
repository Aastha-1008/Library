package com.book.library.service;

import com.book.library.entity.Author;
import com.book.library.entity.Book;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthor();

    Author getAuthorById(Long id);

    void addAuthor(Author author);

    void updateAuthor(Long id, Author author);

    void deleteAuthorById(Long id);
}
