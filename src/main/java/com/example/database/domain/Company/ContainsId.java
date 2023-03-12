package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContainsId implements Serializable {
    private String basketid;
    private int isbn;
}
