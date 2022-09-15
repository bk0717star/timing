package com.example.timing01.domain;

import lombok.Data;


@Data
public class TaskInfo  {
    private Integer id;
    private String cron;
    private String jobName;
    private String status;
    
}