package com.example.database.domain.University;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "COURSE")
@Getter
@Setter
@Builder
public class CourseEntity {
    @Id
    @Column(name="cno")
    private String cno;

    @Column(name="cname")
    private String cname;

    @Column(name="credit")
    private int credit;

    @Column(name="sessions")
    private int sessions;
}
