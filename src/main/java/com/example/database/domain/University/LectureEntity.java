package com.example.database.domain.University;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "LECTURE")
@Getter
@Setter
@Builder
@IdClass(LectureId.class)
public class LectureEntity {
    @Id
    @Column(name="cno")
    private String cno;

    @Id
    @Column(name="pno")
    private int pno;

    @Column(name="lec_time")
    private String lec_time;

    @Column(name="room")
    private String room;
}
