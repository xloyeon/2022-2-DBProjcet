package com.example.database.domain.Company;

//2-b, 데이터를 담기 위한 DTO 생성
public interface searchBookByPublisherDto {
    String getName();
    String getTitle();
    int getPrice();
    int getStock();
}
