package com.example.database.repository.Company;

import com.example.database.domain.Company.WrittenbyEntity;
import com.example.database.domain.Company.WrittenbyId;
import com.example.database.domain.Company.authorBookDto;
import com.example.database.domain.Company.searchBookByAuthorDto;
import com.example.database.domain.University.searchCourseDto;
import com.example.database.domain.University.searchLectureCountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WrittenbyRepository extends JpaRepository<WrittenbyEntity, WrittenbyId> {

    @Override
    @Query(
            value = "SELECT * FROM WRITTEN_BY",
            nativeQuery = true
    )
    List<WrittenbyEntity> findAll();


    @Query(
            value = "SELECT COUNT(NAME) FROM WRITTEN_BY",
            nativeQuery = true
    )
    int countWrittenby();

    //2-d, 입력받은 저자 정보가 없으면 등록함
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO WRITTEN_BY(NAME, ADDRESS, ISBN) VALUES (:name, :address, :isbn)",
            nativeQuery = true
    )
    void saveOne(
            @Param("name") String name,
            @Param("address") String address,
            @Param("isbn") int isbn
    );

    //2-d, 입력 받은 저자 정보를 뽑아냄
    @Transactional
    @Query(
            value = "SELECT * FROM WRITTEN_BY WHERE NAME = :name AND ADDRESS= :address AND ISBN = :isbn ",
            nativeQuery = true
    )
    WrittenbyEntity findOne(
            @Param("name") String name,
            @Param("address") String address,
            @Param("isbn") int isbn
    );

    //2-a, 입력받은 작가 이름, 이메일과 같은 작가가 작성한 도서 제목, 도서의 재고 수량을 뽑아낸다.
    @Transactional
    @Query(
            value = "SELECT NAME, TITLE, SUM(NUM) AS sumNUM " +
                    "FROM WRITTEN_BY NATURAL JOIN BOOK NATURAL JOIN STOCKS " +
                    "WHERE NAME = :name AND ADDRESS = :address "+
                    "GROUP BY NAME, TITLE ",
            nativeQuery = true
    )
    List<searchBookByAuthorDto> searchBookByAuthor(
            @Param("name") String name,
            @Param("address") String address
    );

   //2-f, 작가별 도서의 총 개수, 최고, 최저, 평균 가격을 뽑아냄
    @Transactional
    @Query(
            value = "SELECT NAME, COUNT(ISBN) AS bookCount, MIN(PRICE) AS MIN, " +
                    "MAX(PRICE) AS MAX, AVG(PRICE) AS AVG " +
                    "FROM WRITTEN_BY NATURAL JOIN BOOK " +
                    "GROUP BY NAME ",
            nativeQuery = true
    )
    List<authorBookDto> searchAuthorBookCount();
}
