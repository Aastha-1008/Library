package com.book.library.repository;

import com.book.library.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {

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

    @Modifying
    @Query(
            value = "delete from author a where a.id = :id",
            nativeQuery = true
    )
    public void deleteAuthor(Long id);

}
