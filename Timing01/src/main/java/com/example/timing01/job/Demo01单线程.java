package com.example.timing01.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 执行任务的类
 */
//@Component
public class Demo01单线程 {

    private static final Log logger = LogFactory.getLog(Demo01单线程.class);

    @Scheduled(cron = "0/5 * * * * ?")  // cron表达式
    public void test() {
        logger.info("任务1正在打印日志...");
    }

    // todo 疑问：若同时开启两个任务，会存在什么效果呢？

    @Async("bankThreadPool")
    public void test02() {
        logger.info("任务2正在打印日志...");
    }

}
