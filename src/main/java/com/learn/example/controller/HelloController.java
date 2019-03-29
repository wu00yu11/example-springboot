package com.learn.example.controller;

import com.alibaba.fastjson.JSON;
import com.learn.example.service.IRedisService;
import com.learn.example.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author zjj
 * @date 2019/3/28 0028
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Resource
    private IRedisService redisService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        UserVo userVo = new UserVo();
        userVo.setAddress("上海");
        userVo.setName("jantent");
        userVo.setAge(23);
        redisTemplate.opsForValue().set("test",userVo);

        log.info(JSON.toJSONString(redisTemplate.opsForValue().get("test")));
        return "hello world!";
    }

}
