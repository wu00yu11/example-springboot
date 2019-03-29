package com.learn.example.mapper;

import com.learn.example.model.PayPlatform;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayPlatformMapper {

    int insert(PayPlatform record);

}