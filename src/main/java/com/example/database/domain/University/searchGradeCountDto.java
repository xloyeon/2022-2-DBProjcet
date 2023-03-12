package com.example.database.domain.University;

//1-f, 과목별, 학점별, 학생 수를 담기 위한 dto 생성
public interface searchGradeCountDto {
    String getCno();
    String getGrade();
    int getCountStudent();
}
