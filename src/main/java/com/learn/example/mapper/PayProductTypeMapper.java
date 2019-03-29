package com.learn.example.mapper;

import com.learn.example.model.PayProductType;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayProductTypeMapper {

    int insert(PayProductType record);

}