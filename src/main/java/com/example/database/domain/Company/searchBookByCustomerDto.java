package com.example.database.domain.Company;

//2-c, 데이터를 담기 위한 DTO를 생성함
public interface searchBookByCustomerDto {
    String getEmail();
    int getIsbn();
    String getPublisher();
    String getAuthor();
}