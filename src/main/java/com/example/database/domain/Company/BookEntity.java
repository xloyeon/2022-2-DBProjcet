package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BOOK")
@Getter
@Setter
@Builder
public class BookEntity {
    @Id
    @Column(name="isbn")
    private int isbn;

    @Column(name="title")
    private String title;

    @Column(name="year")
    private int year;

    @Column(name="price")
    private int price;
}
