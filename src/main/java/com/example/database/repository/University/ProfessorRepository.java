package com.example.database.repository.University;

import com.example.database.domain.University.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Integer> {

    //1-a, 각 테이블에 존재하는 Data를 확인
    @Override
    @Query(
            value = "SELECT * FROM PROFESSOR",
            nativeQuery = true
    )
    List<ProfessorEntity> findAll();

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    @Query(
            value = "SELECT COUNT(PNO) FROM PROFESSOR",
            nativeQuery = true
    )
    int countProfessors();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO PROFESSOR(PNO, PNAME, PMAJOR, PDEPT) VALUES (:pno, :pname, :pmajor, :pdept)",
            nativeQuery = true
    )
    void saveOne(
            @Param("pno") int pno,
            @Param("pname") String pname,
            @Param("pmajor") String pmajor,
            @Param("pdept") String pdept
    );
}

