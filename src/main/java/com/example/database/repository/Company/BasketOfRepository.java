package com.example.database.repository.Company;

import com.example.database.domain.Company.BasketOfEntity;
import com.example.database.domain.Company.BasketOfId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BasketOfRepository extends JpaRepository<BasketOfEntity, BasketOfId> {

    @Override
    @Query(
            value = "SELECT * FROM BASKET_OF",
            nativeQuery = true
    )
    List<BasketOfEntity> findAll();


    @Query(
            value = "SELECT COUNT(EMAIL) FROM BASKET_OF",
            nativeQuery = true
    )
    int countBasketOf();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO BASKET_OF(EMAIL, BASKETID) VALUES (:email, :basketid)",
            nativeQuery = true
    )
    void saveOne(
            @Param("email") String email,
            @Param("basketid") String basketid
    );
}
