package com.example.database.domain.Company;

//2-f, 데이터를 담기 위한 DTO를 생성함
public interface authorBookDto {
    String getName();
    int getBookCount();
    int getMin();
    int getMax();
    double getAvg();
}
