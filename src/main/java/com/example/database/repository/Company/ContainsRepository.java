package com.example.database.repository.Company;

import com.example.database.domain.Company.ContainsEntity;
import com.example.database.domain.Company.ContainsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ContainsRepository extends JpaRepository<ContainsEntity, ContainsId> {

    @Override
    @Query(
            value = "SELECT * FROM CONTAINS",
            nativeQuery = true
    )
    List<ContainsEntity> findAll();


    @Query(
            value = "SELECT COUNT(BASKETID) FROM CONTAINS",
            nativeQuery = true
    )
    int countContains();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO CONTAINS(BASKETID, ISBN, NUM) VALUES (:basketid, :isbn, :num)",
            nativeQuery = true
    )
    void saveOne(
            @Param("basketid") String basketid,
            @Param("isbn") int isbn,
            @Param("num") int num
    );
}
