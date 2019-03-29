package com.learn.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zjj
 * @date 2019/3/26 0026
 */
@Configuration
@MapperScan("com.learn.example.mapper")
public class MybatisConfig {
}
