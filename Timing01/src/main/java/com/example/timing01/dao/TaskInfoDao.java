package com.example.timing01.dao;

import com.example.timing01.domain.TaskInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskInfoDao {

    @Select("select * from SC_TASK_INFO where job_name = #{job_name}")
    TaskInfo selectByName(String job_name);
}