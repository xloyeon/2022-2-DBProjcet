package com.example.database.service.University;

import com.example.database.domain.University.ProfessorEntity;
import com.example.database.repository.University.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    //1-a, 각 테이블에 존재하는 Data를 확인
    public List<ProfessorEntity> findAll(){
        return professorRepository.findAll();
    }

    //1-a, 각 테이블에 존재하는 tuple의 총 갯수
    public int countProfessors(){
        return professorRepository.countProfessors();
    }

    public ProfessorEntity save(ProfessorEntity professorEntity){
        professorRepository.saveOne(
               professorEntity.getPno(),
               professorEntity.getPname(),
               professorEntity.getPmajor(),
               professorEntity.getPdept()
        );
        return professorEntity;
    }
}
