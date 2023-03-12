package com.example.database.service.Company;

import com.example.database.domain.Company.AuthorEntity;
import com.example.database.domain.Company.PublishedbyEntity;
import com.example.database.domain.Company.WrittenbyEntity;
import com.example.database.repository.Company.AuthorRepository;
import com.example.database.repository.Company.PublishedbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishedbyService {
    @Autowired
    private PublishedbyRepository publishedbyRepository;

    public List<PublishedbyEntity> findAll(){
        return publishedbyRepository.findAll();
    }

    public int countPublishedby(){
        return publishedbyRepository.countPublishedby();
    }

    //2-d, 입력받은 출판사 정보를 등록하고, 해당 정보를 가져옴
    public PublishedbyEntity save(String name, int isbn){
        publishedbyRepository.saveOne(name, isbn);
        return publishedbyRepository.findOne(name, isbn);
    }
}
