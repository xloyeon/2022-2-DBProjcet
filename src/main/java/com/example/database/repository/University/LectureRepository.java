package com.example.database.repository.University;

import com.example.database.domain.University.EnrollEntity;
import com.example.database.domain.University.EnrollId;
import com.example.database.domain.University.LectureEntity;
import com.example.database.domain.University.LectureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<LectureEntity, LectureId> {

    //1-a, 각 테이블에 존재하는 Data를 확인
    @Override
    @Query(
            value = "SELECT * FROM LECTURE",
            nativeQuery = true
    )
    List<LectureEntity> findAll();

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    @Query(
            value = "SELECT COUNT(CNO) FROM LECTURE",
            nativeQuery = true
    )
    int countLectures();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO LECTURE(CNO, PNO, LEC_TIME, ROOM) VALUES (:cno, :pno, :lec_time, :room)",
            nativeQuery = true
    )
    void saveOne(
            @Param("cno") String cno,
            @Param("pno") int pno,
            @Param("lec_time") String lec_time,
            @Param("room") String room
    );
}
