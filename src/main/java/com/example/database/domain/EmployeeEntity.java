package com.example.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="EMP")
@Builder
@Getter

public class EmployeeEntity {
    @Id
    private int empno;

    private String ename;
}
