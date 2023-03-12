package com.example.database.service.Company;

import com.example.database.domain.Company.ContainsEntity;
import com.example.database.repository.Company.ContainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainsService {
    @Autowired
    private ContainsRepository containsRepository;

    public List<ContainsEntity> findAll(){
        return containsRepository.findAll();
    }

    public int countContains(){
        return containsRepository.countContains();
    }

    public ContainsEntity save(ContainsEntity containsEntity){
        containsRepository.saveOne(
                containsEntity.getBasketid(),
                containsEntity.getIsbn(),
                containsEntity.getNum()
        );
        return containsEntity;
    }
}

