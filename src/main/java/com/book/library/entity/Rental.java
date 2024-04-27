package com.book.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="rental")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rental implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name="book_id")
    private Book book;

    @Column(name="renter_name")
    private String renterName;

    @Column(name="rental_date")
    private Date rentalDate;

    @Column(name="return_date")
    private Date returnDate;
}
