package com.learn.example.mapper;

import com.learn.example.model.PayChannal;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayChannalMapper {

    int insert(PayChannal record);

}