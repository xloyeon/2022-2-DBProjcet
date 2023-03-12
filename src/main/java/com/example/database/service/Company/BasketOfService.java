package com.example.database.service.Company;

import com.example.database.domain.Company.BasketOfEntity;
import com.example.database.repository.Company.BasketOfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketOfService {
    @Autowired
    private BasketOfRepository basketOfRepository;

    public List<BasketOfEntity> findAll(){
        return basketOfRepository.findAll();
    }

    public int countBasketOf(){
        return basketOfRepository.countBasketOf();
    }

    public BasketOfEntity save(BasketOfEntity basketOfEntity){
        basketOfRepository.saveOne(
                basketOfEntity.getEmail(),
                basketOfEntity.getBasketid()
        );
        return basketOfEntity;
    }
}
