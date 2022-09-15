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
//@EnableAsync    // 表示开启对异步任务的支持，就可以使用多线程了
public class Demo02多线程 {

    private static final Log logger = LogFactory.getLog(Demo02多线程.class);

    @Async("bankThreadPool") // 在方法上加入这个注解，异步执行方法。Spring 会从指定的线程池中获取新线程来执行方法，@Async("name") 会用指定 name 的线程池来处理。
    @Scheduled(cron = "0/5 * * * * ?")  // cron表达式
    public void test() {
        logger.info("任务1正在打印日志...");
    }


    @Async("bankThreadPool")
    @Scheduled(cron = "0/5 * * * * ?")  // cron表达式
    public void test02() {
        logger.info("任务2正在打印日志...");
    }

}
