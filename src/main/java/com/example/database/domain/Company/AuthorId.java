package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthorId implements Serializable {
    private String name;
    private String address;
}
