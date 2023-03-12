package com.example.database.repository.Company;

import com.example.database.domain.Company.PublishedbyEntity;
import com.example.database.domain.Company.StocksEntity;
import com.example.database.domain.Company.StocksId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StocksRepository extends JpaRepository<StocksEntity, StocksId> {

    @Override
    @Query(
            value = "SELECT * FROM STOCKS",
            nativeQuery = true
    )
    List<StocksEntity> findAll();


    @Query(
            value = "SELECT COUNT(ISBN) FROM STOCKS",
            nativeQuery = true
    )
    int countStocks();


    //2-d, 입력받은 재고 정보가 없으면 새로 등록하고, 있다면 재고 수를 업데이트함
    @Modifying
    @Transactional
    @Query(
            value = "MERGE INTO STOCKS USING DUAL " +
                    "ON (ISBN =:isbn AND CODE = :code) " +
                    "when matched then " +
                    "UPDATE SET NUM = :num " +
                    "WHEN NOT MATCHED THEN " +
                    "INSERT (ISBN, CODE, NUM) VALUES (:isbn, :code, :num)",
            nativeQuery = true
    )
    void saveOne(
            @Param("isbn") int isbn,
            @Param("code") String code,
            @Param("num") int num
    );

    //2-d, 입력받은 재고 정보가
    @Transactional
    @Query(
            value = "SELECT * FROM STOCKS WHERE ISBN = :isbn AND CODE = :code ",
            nativeQuery = true
    )
    StocksEntity findOne(
            @Param("isbn") int isbn,
            @Param("code") String code
    );
}

