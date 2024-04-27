package com.book.library.controller;

import com.book.library.entity.Author;
import com.book.library.entity.Book;
import com.book.library.response.GenericResponse;
import com.book.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public GenericResponse getAllAuthor(){
        List<Author> listOfAuthor = authorService.findAllAuthor();
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all books.").body(listOfAuthor).build();
    }

    @GetMapping("/{id}")
    public GenericResponse getAuthorById(@PathVariable Long id){
        Author author = authorService.getAuthorById(id);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all authors").body(author).build();
    }

    @PostMapping("/")
    public GenericResponse addAuthor(@RequestBody Author author){
        if(author == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please mention id").build();
        authorService.addAuthor(author);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully inserted author").build();
    }

    @PutMapping("/{id}")
    public GenericResponse updateAuthor(@PathVariable Long id,@RequestBody Author author){
        if(id == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please provide author id ").build();
        authorService.updateAuthor(id,author);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully updated author with id "+ id).build();
    }

    @DeleteMapping("/{id}")
    public GenericResponse deleteAuthor(@PathVariable Long id){
        if(id == null)
            return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Please provide author id ").build();
        authorService.deleteAuthorById(id);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully deleted author with id " + id).build();
    }
}
