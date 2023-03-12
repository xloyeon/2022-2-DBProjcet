package com.example.database.service.Company;

import com.example.database.domain.Company.CustomerEntity;
import com.example.database.domain.Company.searchBookByCustomerDto;
import com.example.database.repository.Company.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    //2-c, 모든 고객의 정보를 확인
    public List<CustomerEntity> findAll(){
        return customerRepository.findAll();
    }

    public CustomerEntity save(CustomerEntity customerEntity){
        customerRepository.saveOne(
                customerEntity.getEmail(),
                customerEntity.getName(),
                customerEntity.getAddress(),
                customerEntity.getPhone()
        );
        return customerEntity;
    }

    //2-c, 입력받은 고객에 대한 정보를 확인
    public List<searchBookByCustomerDto> searchBookByCustomer(String email){
        return customerRepository.searchBookByCustomer(email);
    }
}
