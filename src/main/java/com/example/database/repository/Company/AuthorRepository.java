package com.example.database.repository.Company;

import com.example.database.domain.Company.AuthorEntity;
import com.example.database.domain.Company.AuthorId;
import com.example.database.domain.Company.PublishedbyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, AuthorId> {

    @Override
    @Query(
            value = "SELECT * FROM AUTHOR",
            nativeQuery = true
    )
    List<AuthorEntity> findAll();


    @Query(
            value = "SELECT COUNT(NAME) FROM AUTHOR",
            nativeQuery = true
    )
    int countAuthors();

    //2-d, 입력받은 저자 정보가 존재하지 않으면 등록함.
    @Modifying
    @Transactional
    @Query(
            value = "MERGE INTO AUTHOR USING DUAL " +
                    "ON (NAME = :name AND ADDRESS = :address) " +
                    "WHEN NOT MATCHED THEN " +
                    "INSERT (NAME, ADDRESS, URL) VALUES (:name, :address, :url)",
            nativeQuery = true
    )
    void saveOne(
            @Param("name") String name,
            @Param("address") String address,
            @Param("url") String url
    );

    //2-d, 입력한 저자 정보를 뽑아냄
    @Transactional
    @Query(
            value = "SELECT * FROM AUTHOR WHERE NAME = :name AND ADDRESS= :address ",
            nativeQuery = true
    )
    AuthorEntity findOne(
            @Param("name") String name,
            @Param("address") String address
    );
}


