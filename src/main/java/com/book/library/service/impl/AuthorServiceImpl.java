package com.book.library.service.impl;

import com.book.library.entity.Author;
import com.book.library.entity.Book;
import com.book.library.repository.AuthorRepository;
import com.book.library.service.AuthorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAllAuthor() {
        return authorRepository.findAllAuthor();
    }

    @Override
    public Author getAuthorById(Long id){
        return authorRepository.findAuthorById(id);
    }

    @Override
    public void addAuthor(Author author){
        Author a = new Author();
        a.setName(author.getName());
        a.setBiography(author.getBiography());

        authorRepository.save(a);
    }

    @Transactional
    @Override
    public void updateAuthor(Long id, Author author){
        if(author == null)return;
        Author a = authorRepository.findAuthorById(id);
        a.setBiography(author.getBiography());
        a.setName(author.getName());
        authorRepository.save(a);
    }

    @Transactional
    @Override
    public void deleteAuthorById(Long id){
        authorRepository.deleteAuthor(id);
    }
}
