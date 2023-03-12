package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WAREHOUSE")
@Getter
@Setter
@Builder
public class WarehouseEntity {
    @Id
    @Column(name="code")
    private String code;

    @Column(name="address")
    private String address;

    @Column(name="phone")
    private String phone;
}

