package com.book.library.service.impl;

import com.book.library.entity.Book;
import com.book.library.entity.Rental;
import com.book.library.repository.BookRepository;
import com.book.library.repository.RentalRepository;
import com.book.library.service.BookService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private RentalRepository rentalRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAllBook();
    }

    @Override
    public Book getBookById(Long id){
        return bookRepository.findBookById(id);
    }

    @Override
    public String insertBook(Book book){
        //check if isbn already exist or not
        Book existingRecord = bookRepository.findBookByIsbn(book.getIsbn());
        if(existingRecord != null)return "Book with this isbn already exist";

        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setIsbn(book.getIsbn());
        b.setPublicationYear(book.getPublicationYear());
        bookRepository.save(b);
        return "Successfully inserted book";
    }

    @Transactional
    @Override
    public void updateBook(Long id, Book book){
        if(book == null)return;
        Book b = bookRepository.findBookById(id);
        b.setAuthor(book.getAuthor());
        b.setTitle(book.getTitle());
        b.setIsbn(book.getIsbn());
        b.setPublicationYear(book.getPublicationYear());

        bookRepository.save(b);
    }

    @Transactional
    @Override
    public void deleteBookById(Long id){
        rentalRepository.deleteByBookId(id);
        bookRepository.deleteById(id);
    }
}
