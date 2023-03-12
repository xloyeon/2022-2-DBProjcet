package com.example.database.domain.University;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "ENROLL")
@Getter
@Setter
@Builder
@IdClass(EnrollId.class)
public class EnrollEntity {
    @Id
    @Column(name="sno")
    private int sno;

    @Id
    @Column(name="cno")
    private String cno;

    @Column(name="grade")
    private String grade;

    @Column(name="exam")
    private int exam;
}
