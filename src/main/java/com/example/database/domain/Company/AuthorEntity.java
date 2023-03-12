package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "AUTHOR")
@Getter
@Setter
@Builder
@IdClass(AuthorId.class)
public class AuthorEntity {
    @Id
    @Column(name="name")
    private String name;

    @Id
    @Column(name="address")
    private String address;

    @Column(name="url")
    private String url;
}

