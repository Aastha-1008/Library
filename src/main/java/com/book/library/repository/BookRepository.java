package com.book.library.repository;

import com.book.library.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookRepository extends Repository<Book,Long> {

    @Query(
        value = "select * from book",
        nativeQuery = true
    )
    public List<Book> findAllBook();

    @Query(
            value = "select * from book b where b.id = :id",
            nativeQuery = true
    )
    public Book findBookById(Long id);
}
