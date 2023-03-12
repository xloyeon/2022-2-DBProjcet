package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class WrittenbyId implements Serializable {
    private String name;
    private String address;
    private int isbn;
}
