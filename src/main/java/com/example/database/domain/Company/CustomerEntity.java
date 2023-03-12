package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "CUSTOMER")
@Getter
@Setter
@Builder
public class CustomerEntity {
    @Id
    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="phone")
    private String phone;
}
