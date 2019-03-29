package com.learn.example.mapper;


import com.learn.example.model.PayBank;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayBankMapper {

    int insert(PayBank record);
}