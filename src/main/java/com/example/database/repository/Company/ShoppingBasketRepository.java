package com.example.database.repository.Company;

import com.example.database.domain.Company.ShoppingBasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasketEntity, String> {
    @Override
    @Query(
            value = "SELECT * FROM SHOPPING_BASKET",
            nativeQuery = true
    )
    List<ShoppingBasketEntity> findAll();


    @Query(
            value = "SELECT COUNT(BASKETID) FROM SHOPPING_BASKET",
            nativeQuery = true
    )
    int countBaskets();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO SHOPPING_BASKET(BASKETID) VALUES (:basketid)",
            nativeQuery = true
    )
    void saveOne(
            @Param("basketid") String basketid
    );
}
