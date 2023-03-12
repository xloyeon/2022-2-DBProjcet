package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BASKET_OF")
@Getter
@Setter
@Builder
@IdClass(BasketOfId.class)
public class BasketOfEntity {
    @Id
    @Column(name="email")
    private String email;

    @Id
    @Column(name="basketid")
    private String basketid;
}
