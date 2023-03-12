package com.example.database.service.University;

import com.example.database.domain.University.*;
import com.example.database.repository.University.EnrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;

    //1-a, 각 테이블에 존재하는 Data를 확인
    public List<EnrollEntity> findAll(){
        return enrollRepository.findAll();
    }

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    public int countEnrolls(){
        return enrollRepository.countEnrolls();
    }

    public EnrollEntity save(EnrollEntity enrollEntity){
        enrollRepository.saveOne(
                enrollEntity.getSno(),
                enrollEntity.getCno(),
                enrollEntity.getGrade(),
                enrollEntity.getExam()
        );
        return enrollEntity;
    }

    //1-b
    public List<searchCourseDto> searchCourse(int sno){
        return enrollRepository.searchCourse(sno);
    }

    //1-c
    public List<searchGradeDto> searchGrade(){
        return enrollRepository.searchGrade();
    }

    //1-c
    public List<EnrollEntity> updateEnroll(){
        enrollRepository.modifyGrade();
        return findAll();
    }

    //1-d
    public List<searchRankDto> searchMax(){
        return enrollRepository.searchMax();
    }

    //1-d
    public List<searchRankDto> searchMin(){
        return enrollRepository.searchMin();
    }

    //1-e
    public List<searchStudentCreditDto> searchStudentCredit(){
        return enrollRepository.searchStudentCredit();
    }

    //1-f, 과목별 전체 평균 점수
    public List<searchCourseAvgDto> searchCourseAvg(){
        return enrollRepository.searchCourseAvg();
    }

    //1-f, 과목별, 학점별 학생 수
    public List<searchGradeCountDto> searchGradeCount(){return enrollRepository.searchGradeCount();}

    //1-g
    public List<searchLectureCountDto> searchLectureCount(){
        return enrollRepository.searchLectureCount();
    }
}

