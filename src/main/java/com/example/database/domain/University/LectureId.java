package com.example.database.domain.University;

import lombok.Data;

import java.io.Serializable;

@Data
public class LectureId implements Serializable {
    private String cno;
    private int pno;
}
