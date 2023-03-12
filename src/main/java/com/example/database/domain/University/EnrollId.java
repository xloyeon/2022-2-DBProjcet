package com.example.database.domain.University;

import lombok.Data;

import java.io.Serializable;

@Data
public class EnrollId implements Serializable {
    private int sno;
    private String cno;
}
