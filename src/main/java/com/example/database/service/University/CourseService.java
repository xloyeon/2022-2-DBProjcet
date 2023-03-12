package com.example.database.service.University;

import com.example.database.domain.University.CourseEntity;
import com.example.database.repository.University.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    //1-a, 각 테이블에 존재하는 Data를 확인
    public List<CourseEntity> findAll(){
        return courseRepository.findAll();
    }

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    public int countCourses(){
        return courseRepository.countCourses();
    }

    public CourseEntity save(CourseEntity courseEntity){
        courseRepository.saveOne(
               courseEntity.getCno(),
               courseEntity.getCname(),
               courseEntity.getCredit(),
               courseEntity.getSessions()
        );
        return courseEntity;
    }
}
