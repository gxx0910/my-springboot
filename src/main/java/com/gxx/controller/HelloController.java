package com.gxx.controller;

import com.gxx.Girl;
import com.gxx.service.GirlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.ShardedJedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 11246 on 2017/12/7  0007.
 */
@RestController
@Slf4j
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.profiles}")
    private String profiles;
//    @Autowired
//    private JedisConnection redis;

    @Autowired
    private GirlService girlService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        log.info("{}环境的端口号是{}", profiles, port);
        return profiles + "环境的的端口号是" + port;
    }

    @GetMapping(value = "/girl")
    public List<Girl> findGirl(@RequestParam("id") int id) {
        log.info("{}环境的端口号是{}", profiles, port);
        return girlService.findGirlAll(id);

    }
}
