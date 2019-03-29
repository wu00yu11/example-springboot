package com.learn.example.mapper;

import com.learn.example.model.RoutPlatformPayProduct;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface RoutPlatformPayProductMapper {

    int insert(RoutPlatformPayProduct record);

}