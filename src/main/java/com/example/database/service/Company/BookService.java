package com.example.database.service.Company;

import com.example.database.domain.Company.BookEntity;
import com.example.database.domain.Company.allBookDto;
import com.example.database.domain.Company.priceByYearDto;
import com.example.database.domain.Company.updatedDto;
import com.example.database.repository.Company.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    public int countBooks(){
        return bookRepository.countBooks();
    }

    //2-d, 입력받은 도서 정보를 통해 도서를 등록하고, 해당 도서 정보를 가져옴
    public BookEntity save(int isbn, String title, int year, int price){
        bookRepository.saveOne(isbn, title, year, price);
        return bookRepository.findOne(isbn);
    }

    //2-e, 전체 도서의 평균 가격 전달
    public double averagePrice(){ return bookRepository.averagePrice();}

    //2-e, 년도별 평균 가격 전달
    public List<priceByYearDto> priceByYear(){
        return bookRepository.priceByYear();
    }

    //2-g, 재고가 특정 부수 이상 넘어가는 도서에 할인을 적용함
    public void updatePrice(int stock, int discount){
        bookRepository.updatePrice(stock, discount);
    }

    //2-g, 전체 도서의 가격과 재고량을 확인함
    public List<allBookDto> allBook(){return bookRepository.allBook();}

    //2-g, 할인을 적용한 도서 정보를 가져옴
    public List<updatedDto> updated(int stock){
        return bookRepository.updated(stock);
    }
}
