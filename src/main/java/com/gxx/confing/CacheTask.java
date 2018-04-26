package com.gxx.confing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by gaoxx on 2018/4/16  0016.
 */
@Component
@Slf4j
public class CacheTask {
    @Scheduled(fixedDelay = 3600*1000)
    public void messageCacheEvict() {
        log.info("定时器测试数据{}", new Date());
    }
}
