package com.example.database.domain.Company;

import lombok.Data;

import java.io.Serializable;

@Data
public class BasketOfId implements Serializable {
    private String email;
    private String basketid;
}
