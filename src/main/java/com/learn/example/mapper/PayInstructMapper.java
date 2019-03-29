package com.learn.example.mapper;

import com.learn.example.model.PayInstruct;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface PayInstructMapper {

    int insert(PayInstruct record);

}