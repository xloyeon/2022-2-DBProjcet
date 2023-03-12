package com.example.database.domain.University;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PROFESSOR")
@Getter
@Setter
@Builder
public class ProfessorEntity {
    @Id
    @Column(name="pno")
    private int pno;

    @Column(name="pname")
    private String pname;

    @Column(name="pmajor")
    private String pmajor;

    @Column(name="pdept")
    private String pdept;
}
