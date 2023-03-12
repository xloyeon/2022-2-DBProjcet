package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class StocksId implements Serializable {
    private int isbn;
    private String code;
}
