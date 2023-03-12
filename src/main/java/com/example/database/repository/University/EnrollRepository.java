package com.example.database.repository.University;

import com.example.database.domain.University.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, EnrollId> {

    //1-a, 각 테이블에 존재하는 Data를 확인
    @Override
    @Query(
            value = "SELECT * FROM ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAll();

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    @Query(
            value = "SELECT COUNT(SNO) FROM ENROLL",
            nativeQuery = true
    )
    int countEnrolls();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO ENROLL(SNO, CNO, GRADE, EXAM) VALUES (:sno, :cno, :grade, :exam)",
            nativeQuery = true
    )
    void saveOne(
            @Param("sno") int sno,
            @Param("cno") String cno,
            @Param("grade") String grade,
            @Param("exam") int exam
    );

    //1-b, 입력받은 sno를 찾아 해당 sno의 student가 수강하는 course 이름, 학점, 시험 점수를 select해서 뽑아낸다.
    @Transactional
    @Query(
            value = "SELECT C.CNAME, C.CREDIT, C.SESSIONS " +
                    "FROM COURSE C, ENROLL E " +
                    "WHERE E.CNO = C.CNO AND E.SNO = :sno ",
            nativeQuery = true
    ) List<searchCourseDto> searchCourse(@PathVariable("sno") int sno);

    //1-c, 학점이 잘못되어 있는 학생의 이름, 학번, 과목 번호를 select해서 뽑아낸다.
    @Transactional
    @Query(
            value = "SELECT SNAME, SNO, CNO " +
                    "FROM (SELECT S.SNAME, S.SNO, E.CNO, E.EXAM, E.GRADE FROM STUDENT S, ENROLL E WHERE S.SNO = E.SNO) " +
                    "WHERE (EXAM>=90 AND GRADE != 'A') " +
                    "OR (EXAM>=80 AND EXAM <90 AND GRADE != 'B') " +
                    "OR (EXAM>=70 AND EXAM <80 AND GRADE != 'C') " +
                    "OR (EXAM>=60 AND EXAM <70 AND GRADE != 'D') " +
                    "OR (EXAM<60 AND GRADE != 'F')",
            nativeQuery = true
    ) List<searchGradeDto> searchGrade();

    //1-c, 학점이 잘못되어 있는 학생의 학점을 update로 수정함.
    @Modifying
    @Transactional
    @Query(
            value = "UPDATE ENROLL SET GRADE = CASE " +
                    "WHEN EXAM >=90 THEN 'A' " +
                    "WHEN EXAM >=80 AND EXAM <90 THEN 'B' " +
                    "WHEN EXAM >=70 AND EXAM<80 THEN 'C' " +
                    "WHEN EXAM >=60 AND EXAM <70 THEN 'D' " +
                    "WHEN EXAM <60 THEN 'F' END",
            nativeQuery = true
    )
    void modifyGrade();

    //1-d, 과목별로 최고 점수를 획득한 학생의 정보를 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT CNO, MAX(EXAM) OVER(PARTITION BY CNO) AS EXAM, S.SNO, PNO, SNAME, YEAR, DEPT " +
                    "FROM STUDENT S, ENROLL E " +
                    "WHERE S.SNO = E.SNO ",
            nativeQuery = true
    )
    List<searchRankDto> searchMax();

    //1-d, 과목별로 최저 점수를 획들한 학생의 정보를 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT CNO, MIN(EXAM) OVER(PARTITION BY CNO) AS EXAM, S.SNO, PNO, SNAME, YEAR, DEPT " +
                    "FROM STUDENT S, ENROLL E " +
                    "WHERE S.SNO = E.SNO ",
            nativeQuery = true
    )
    List<searchRankDto> searchMin();

    //1-e, 학생 별로 수강한 교과목의 총학점과 시험 점수의 평균을 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT SNO, SUM(CREDIT) AS sumCredit, AVG(EXAM) AS avgExam " +
                    "FROM ENROLL NATURAL JOIN COURSE " +
                    "GROUP BY SNO",
            nativeQuery = true
    )
    List<searchStudentCreditDto> searchStudentCredit();

   //1-f, 과목별로 전체 평균 점수와 학점별 학생 수를 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT CNO, AVG(EXAM) AS avgExam " +
                    "FROM ENROLL " +
                    "GROUP BY CNO " +
                    "ORDER BY CNO ",
            nativeQuery = true
    )
    List<searchCourseAvgDto> searchCourseAvg();

    //1-f, 과목별로 학점별 학생 수를 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT CNO, GRADE, COUNT(SNO) AS countStudent " +
                    "FROM ENROLL " +
                    "GROUP BY (CNO, GRADE) " +
                    "ORDER BY CNO, GRADE",
            nativeQuery = true
    )
    List<searchGradeCountDto> searchGradeCount();

    //1-g, 학과별로 개설된 강좌의 수를 select해서 뽑아냄
    @Transactional
    @Query(
            value = "SELECT DEPT, COUNT(CNO) AS countLecture " +
                    "FROM ENROLL NATURAL JOIN STUDENT NATURAL JOIN LECTURE " +
                    "GROUP BY DEPT ",
            nativeQuery = true
    )
    List<searchLectureCountDto> searchLectureCount();

}



