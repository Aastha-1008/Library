package com.book.library.repository;

import com.book.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    @Query(
        value = "select * from book",
        nativeQuery = true
    )
    public List<Book> findAllBook();

    @Query(
            value = "select * from book where book.id = :id",
            nativeQuery = true
    )
    public Book findBookById(Long id);

    @Query(
            value = "select * from book where book.isbn = :isbn",
            nativeQuery = true
    )
    public Book findBookByIsbn(String isbn);

    @Modifying
    @Query(
            value = "delete from book where book.id = :id",
            nativeQuery = true
    )
    public void deleteBookById(Long id);

}
