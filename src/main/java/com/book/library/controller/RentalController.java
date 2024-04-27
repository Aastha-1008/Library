package com.book.library.controller;

import com.book.library.entity.Book;
import com.book.library.entity.Rental;
import com.book.library.response.GenericResponse;
import com.book.library.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/record")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @GetMapping("/")
    public GenericResponse getAllRentalRecord(){
        List<Rental> rentalRecord = rentalService.getAllRentalRecords();
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all records").body(rentalRecord).build();
    }

    @GetMapping("/overdue")
    public GenericResponse getAllOverdueRecords(){
        List<Rental> rentalRecord = rentalService.getAllOverdueRentalRecords();
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully fetched all overdue records").body(rentalRecord).build();
    }

    @PostMapping("/rent/{isbn}")
    public GenericResponse createRentalRecords(@PathVariable String isbn  , @RequestBody String renterName){
        if(isbn == null )return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Isbn is missing ").build();
        if(renterName == null )return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Renter Name is missing ").build();
        String msg = rentalService.createRentalRecords(isbn , renterName);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg(msg).build();
    }

    @PostMapping("/return/{isbn}")
    public GenericResponse returnBook (@PathVariable String isbn){
        if(isbn == null )return GenericResponse.builder().statusCode(HttpStatus.BAD_REQUEST).msg("Isbn is missing ").build();
        String msg = rentalService.returnBook(isbn);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg(msg).build();
    }
}
