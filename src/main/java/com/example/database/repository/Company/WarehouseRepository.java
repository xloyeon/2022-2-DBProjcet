package com.example.database.repository.Company;

import com.example.database.domain.Company.StocksEntity;
import com.example.database.domain.Company.WarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM WAREHOUSE",
            nativeQuery = true
    )
    List<WarehouseEntity> findAll();


    @Query(
            value = "SELECT COUNT(CODE) FROM WAREHOUSE",
            nativeQuery = true
    )
    int countWarehouses();

    //2-d, 입력받은 창고 정보가 없으면 새로 등록함
    @Modifying
    @Transactional
    @Query(
            value = "MERGE INTO WAREHOUSE USING DUAL " +
                    "ON (CODE = :code)" +
                    "WHEN NOT MATCHED THEN " +
                    "INSERT (CODE, ADDRESS, PHONE) VALUES (:code, :address, :phone)",
            nativeQuery = true
    )
    void saveOne(
            @Param("code") String code,
            @Param("address") String address,
            @Param("phone") String phone
    );

    //2-d, 입력 받은 창고 정보를 뽑아냄
    @Transactional
    @Query(
            value = "SELECT * FROM WAREHOUSE WHERE CODE = :code",
            nativeQuery = true
    )
    WarehouseEntity findOne(
            @Param("code") String code
    );
}
