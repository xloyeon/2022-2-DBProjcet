package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class PublishedbyId implements Serializable {
    private String name;
    private int isbn;
}
