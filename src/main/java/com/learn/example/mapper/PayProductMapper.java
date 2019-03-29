package com.learn.example.mapper;

import com.learn.example.model.PayProduct;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayProductMapper {

    int insert(PayProduct record);
}