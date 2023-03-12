package com.example.database.service.Company;

import com.example.database.domain.Company.ShoppingBasketEntity;
import com.example.database.repository.Company.ShoppingBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingBasketService {
    @Autowired
    private ShoppingBasketRepository shoppingBasketRepository;

    public List<ShoppingBasketEntity> findAll(){
        return shoppingBasketRepository.findAll();
    }

    public int countBaskets(){
        return shoppingBasketRepository.countBaskets();
    }

    public ShoppingBasketEntity save(ShoppingBasketEntity shoppingBasketEntity){
        shoppingBasketRepository.saveOne(
               shoppingBasketEntity.getBasketid()
        );
        return shoppingBasketEntity;
    }
}
