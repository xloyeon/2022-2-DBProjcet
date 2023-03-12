package com.example.database.service.University;

import com.example.database.domain.University.*;
import com.example.database.repository.University.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //1-a, 각 테이블에 존재하는 Data를 확인
    public List<StudentEntity> findAll(){
        return studentRepository.findAll();
    }

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    public int countStudents(){
        return studentRepository.countStudents();
    }

    public StudentEntity save(StudentEntity studentEntity){
        studentRepository.saveOne(
                studentEntity.getSno(),
                studentEntity.getPno(),
                studentEntity.getSname(),
                studentEntity.getYear(),
                studentEntity.getDept()
        );
        return studentEntity;
    }

    //1-h, 학과별 총 학생수
    public List<searchbyDeptCountDto> searchbyDeptCount(){
        return studentRepository.searchbyDeptCount();
    }

    //1-h, 학년별 총 학생수
    public List<searchbyYearCountDto> searchbyYearCount(){
        return studentRepository.searchbyYearCount();
    }
}
