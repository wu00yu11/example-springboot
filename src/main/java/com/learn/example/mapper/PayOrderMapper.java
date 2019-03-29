package com.learn.example.mapper;

import com.learn.example.model.PayOrder;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayOrderMapper {

    int insert(PayOrder record);
}