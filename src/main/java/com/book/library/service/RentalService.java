package com.book.library.service;

import com.book.library.entity.Book;
import com.book.library.entity.Rental;

import java.util.List;

public interface RentalService {

    List<Rental> getAllRentalRecords();

    List<Rental>getAllOverdueRentalRecords();

    String createRentalRecords(String isbn , String renterName);

    String returnBook(String isbn);
}
