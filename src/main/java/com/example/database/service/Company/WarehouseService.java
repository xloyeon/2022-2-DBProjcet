package com.example.database.service.Company;

import com.example.database.domain.Company.WarehouseEntity;
import com.example.database.repository.Company.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<WarehouseEntity> findAll(){
        return warehouseRepository.findAll();
    }

    public int countWarehouses(){
        return warehouseRepository.countWarehouses();
    }

    //2-d, 입력받은 창고 정보를 등록하고, 해당 정보를 가져옴
    public WarehouseEntity save(String code, String address, String phone){
        warehouseRepository.saveOne(code, address, phone);
        return warehouseRepository.findOne(code);
    }
}
