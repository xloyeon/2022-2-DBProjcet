package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "STOCKS")
@Getter
@Setter
@Builder
@IdClass(StocksId.class)
public class StocksEntity {
    @Id
    @Column(name="isbn")
    private int isbn;

    @Id
    @Column(name="code")
    private String code;

    @Column(name="num")
    private int num;
}
