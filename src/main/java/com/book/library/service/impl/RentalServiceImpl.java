package com.book.library.service.impl;

import com.book.library.entity.Book;
import com.book.library.entity.Rental;
import com.book.library.repository.BookRepository;
import com.book.library.repository.RentalRepository;
import com.book.library.service.RentalService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Rental> getAllRentalRecords(){
        return rentalRepository.findAllRentalRecords();
    }

    @Override
    public List<Rental> getAllOverdueRentalRecords() {
        return rentalRepository.findAllOverdueRentalRecords();
    }

    @Override
    public String createRentalRecords(String isbn, String renterName) {
        //check is it already present or not
        Book book = bookRepository.findBookByIsbn(isbn);
        Rental existingRecord = rentalRepository.findRentalRecordByBookId(book.getId());
        if(existingRecord != null){
            return "Book is already rented and will we available after " + existingRecord.getReturnDate();
        }
        Rental r = new Rental();
        r.setBook(book);
        r.setRenterName(renterName);
        r.setRentalDate(new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        r.setReturnDate(calendar.getTime());

        rentalRepository.save(r);
        return "Book is rented successfully . ";
    }

    @Transactional
    public String returnBook(String isbn){
        Book book = bookRepository.findBookByIsbn(isbn);
        rentalRepository.deleteByBookId(book.getId());
        return "Book returned successfully";
    }
}
