package com.example.database.domain.Company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "SHOPPING_BASKET")
@Getter
@Setter
@Builder
public class ShoppingBasketEntity {
    @Id
    @Column(name="basketid")
    private String basketid;
}
