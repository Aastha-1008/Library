package com.book.library.repository;

import com.book.library.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental,Long> {

    @Query(
            value = "select * from rental",
            nativeQuery = true
    )
    public List<Rental> findAllRentalRecords();


    @Query(
            value = "select * from rental r where r.return_date < CURRENT_DATE",
            nativeQuery = true
    )
    public List<Rental> findAllOverdueRentalRecords();

    @Query(
            value = "select * from rental r where r.book_id = :id",
            nativeQuery = true
    )
    public Rental findRentalRecordByBookId(Long id);


    @Modifying
    @Query(
        value = "delete from rental r where r.book_id = :id",
            nativeQuery = true
    )
    public void deleteByBookId(Long id);
}
