package com.example.timing01;

import com.example.timing01.dao.TaskInfoDao;
import com.example.timing01.domain.TaskInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Timing01ApplicationTests {
    @Resource
    private TaskInfoDao taskInfoDao;

    @Test
    void contextLoads() {
        TaskInfo taskInfo =taskInfoDao.selectByName("downLoadTaskV3");
        System.out.println(taskInfo);
    }

}
