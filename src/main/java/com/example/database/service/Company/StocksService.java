package com.example.database.service.Company;

import com.example.database.domain.Company.StocksEntity;
import com.example.database.domain.University.EnrollEntity;
import com.example.database.repository.Company.BookRepository;
import com.example.database.repository.Company.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksService {
    @Autowired
    private StocksRepository stocksRepository;

    public List<StocksEntity> findAll(){
        return stocksRepository.findAll();
    }

    public int countStocks(){
        return stocksRepository.countStocks();
    }

    //2-d, 입력받은 재고 정보를 등록하고, 해당 정보를 가져옴
    public StocksEntity save(int isbn, String code, int num){
        stocksRepository.saveOne(isbn, code, num);
        return stocksRepository.findOne(isbn, code);
    }
}

