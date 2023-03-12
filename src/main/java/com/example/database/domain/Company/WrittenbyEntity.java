package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WRITTENBY")
@Getter
@Setter
@Builder
@IdClass(WrittenbyId.class)
public class WrittenbyEntity {
    @Id
    @Column(name="name")
    private String name;

    @Id
    @Column(name="address")
    private String address;

    @Id
    @Column(name="isbn")
    private int isbn;
}


