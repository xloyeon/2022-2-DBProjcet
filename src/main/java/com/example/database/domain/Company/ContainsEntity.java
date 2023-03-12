package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "CONTAINS")
@Getter
@Setter
@Builder
@IdClass(ContainsId.class)
public class ContainsEntity {
    @Id
    @Column(name="basketid")
    private String basketid;

    @Id
    @Column(name="isbn")
    private int isbn;

    @Column(name="num")
    private int num;
}

