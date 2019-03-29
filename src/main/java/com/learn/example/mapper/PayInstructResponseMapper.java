package com.learn.example.mapper;

import com.learn.example.model.PayInstructResponse;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayInstructResponseMapper {

    int insert(PayInstructResponse record);

}