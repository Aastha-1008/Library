package com.book.library.repository;

import com.book.library.entity.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AuthorRepository extends Repository<Author,Long> {

    @Query(
            value = "select * from author",
            nativeQuery = true
    )
    public List<Author> findAllAuthor();

    @Query(
            value = "select * from author a where a.id = :id",
            nativeQuery = true
    )
    public  Author findAuthorById(Long id);

}
