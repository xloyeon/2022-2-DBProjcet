package com.example.database.repository.University;

import com.example.database.domain.University.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    //1-a, 각 테이블에 존재하는 Data를 확인
    @Override
    @Query(
            value = "SELECT * FROM STUDENT",
            nativeQuery = true
    )
    List<StudentEntity> findAll();

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    @Query(
            value = "SELECT COUNT(SNO) FROM STUDENT",
            nativeQuery = true
    )
    int countStudents();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO STUDENT(SNO, PNO, SNAME, YEAR, DEPT) VALUES (:sno, :pno, :sname, :year, :dept)",
            nativeQuery = true
    )
    void saveOne(
            @Param("sno") int sno,
            @Param("pno") int pno,
            @Param("sname") String sname,
            @Param("year") int year,
            @Param("dept") String dept
    );

    //1-h, 학과별 총 학생 수를 계산해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT DEPT, COUNT(SNO) AS countStudent " +
                    "FROM STUDENT " +
                    "GROUP BY DEPT ",
            nativeQuery = true
    )
    List<searchbyDeptCountDto> searchbyDeptCount();

   //1-h, 학년별 학생 수를 계산해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT YEAR, COUNT(SNO) AS countStudent " +
                    "FROM STUDENT " +
                    "GROUP BY YEAR " +
                    "ORDER BY YEAR",
            nativeQuery = true
    )
    List<searchbyYearCountDto> searchbyYearCount();
}
