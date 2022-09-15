DROP TABLE IF EXISTS `SC_TASK_INFO`;
-- h2 建表不能使用 COMMENT='定时任务表'
/*CREATE TABLE `SC_TASK_INFO` (
    `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `cron` varchar(32) DEFAULT NULL COMMENT '定时执行',
    `job_name` varchar(256) DEFAULT NULL COMMENT '任务名称',
    `status` char(1) DEFAULT '0' COMMENT '任务开启状态 0-关闭 2-开启',
    PRIMARY KEY (`id`)
) COMMENT='定时任务表';*/

create table `SC_TASK_INFO`(
   `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   `cron` varchar(32) DEFAULT NULL COMMENT '定时执行',
   `job_name` varchar(256) DEFAULT NULL COMMENT '任务名称',
   `status` char(1) DEFAULT '0' COMMENT '任务开启状态 0-关闭 2-开启',
   PRIMARY KEY (`id`)
)