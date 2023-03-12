package com.example.database.service.Company;

import com.example.database.domain.Company.AuthorEntity;
import com.example.database.domain.Company.WrittenbyEntity;
import com.example.database.repository.Company.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<AuthorEntity> findAll(){
        return authorRepository.findAll();
    }

    public int countAuthors(){
        return authorRepository.countAuthors();
    }

    //2-d, 입력한 저자 정보를 등록하고, 해당 저자 정보를 가져옴
    public AuthorEntity save(String name, String address, String url){
       authorRepository.saveOne(name, address, url);
       return authorRepository.findOne(name, address);
    }
}
