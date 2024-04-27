package com.book.library.controller;

import com.book.library.entity.Book;
import com.book.library.response.GenericResponse;
import com.book.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public GenericResponse getAllBooks(){
        List<Book> listOfBooks = bookService.getAllBooks();
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all books.").body(listOfBooks).build();
    }

    @GetMapping("/{id}")
    public GenericResponse getBookById(@PathVariable Long id){
        Book book = bookService.getBookById(id);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all books.").body(book).build();
    }

    @PostMapping("/")
    public GenericResponse insertBook(@RequestBody Book book){
        if(book == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please mention id").build();
        String msg = bookService.insertBook(book);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg(msg).build();
    }

    @PutMapping("/{id}")
    public GenericResponse updateBook(@PathVariable Long id,@RequestBody Book book){
        if(id == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please provide book id ").build();
        bookService.updateBook(id,book);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully updated book with id "+ id).build();
    }

    @DeleteMapping("/{id}")
    public GenericResponse deleteBook(@PathVariable Long id){
        if(id == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please provide book id ").build();
        bookService.deleteBookById(id);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully deleted book with id " + id).build();
    }
}
