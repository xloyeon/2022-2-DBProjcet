package com.example.database.service.University;

import com.example.database.domain.University.LectureEntity;
import com.example.database.repository.University.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;

    //1-a, 각 테이블에 존재하는 Data를 확인
    public List<LectureEntity> findAll(){
        return lectureRepository.findAll();
    }

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    public int countLectures(){
        return lectureRepository.countLectures();
    }

    public LectureEntity save(LectureEntity lectureEntity){
        lectureRepository.saveOne(
                lectureEntity.getCno(),
                lectureEntity.getPno(),
                lectureEntity.getLec_time(),
                lectureEntity.getRoom()
        );
        return lectureEntity;
    }
}


