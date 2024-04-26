package com.book.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="rental")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book_id")
    private Book book;

    @Column(name="renterName")
    private String renterName;

    @Column(name="rentalDate")
    private Date rentalDate;

    @Column(name="returnDate")
    private Date returnDate;
}
