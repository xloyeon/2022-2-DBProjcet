package com.example.database.repository.University;

import com.example.database.domain.University.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String> {

    //1-a, 각 테이블에 존재하는 Data를 확인
    @Override
    @Query(
            value = "SELECT * FROM COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAll();

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    @Query(
            value = "SELECT COUNT(CNO) FROM COURSE",
            nativeQuery = true
    )
    int countCourses();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO COURSE(CNO, CNAME, CREDIT, SESSIONS) VALUES (:cno, :cname, :credit, :sessions)",
            nativeQuery = true
    )
    void saveOne(
            @Param("cno") String cno,
            @Param("cname") String cname,
            @Param("credit") int credit,
            @Param("sessions") int sessions
    );
}


