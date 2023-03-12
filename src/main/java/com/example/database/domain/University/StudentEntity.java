package com.example.database.domain.University;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="STUDENT")
@Getter
@Setter
@Builder
public class StudentEntity {
    @Id
    @Column(name="sno")
    private int sno;

    @Column(name="pno")
    private int pno;

    @Column(name="sname")
    private String sname;

    @Column(name="year")
    private int year;

    @Column(name="dept")
    private String dept;
}
