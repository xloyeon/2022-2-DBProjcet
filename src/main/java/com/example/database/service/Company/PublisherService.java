package com.example.database.service.Company;

import com.example.database.domain.Company.PublisherEntity;
import com.example.database.repository.Company.PublisherRepository;
import com.example.database.domain.Company.searchBookByPublisherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    //2-b, 모든 출판사 정보를 확인
    public List<PublisherEntity> findAll(){
        return publisherRepository.findAll();
    }

    //2-d, 입력 받은 출판사 정보를 등록하고, 해당 정보를 가져옴
    public PublisherEntity save(String name, String address, String phone, String url){
       publisherRepository.saveOne(name, address, phone, url);
       return publisherRepository.findOne(name);
    }

    //2-b, 특정 출판사 검색하여 도서 제목, 가격, 재고량 확인
    public List<searchBookByPublisherDto> searchBookByPublisher(String name){
        return publisherRepository.searchBookByPublisher(name);
    }

}
