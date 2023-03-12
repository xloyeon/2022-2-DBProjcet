package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PUBLISHED_BY")
@Getter
@Setter
@Builder
@IdClass(PublishedbyId.class)
public class PublishedbyEntity {
    @Id
    @Column(name="name")
    private String name;

    @Id
    @Column(name="isbn")
    private int isbn;
}
