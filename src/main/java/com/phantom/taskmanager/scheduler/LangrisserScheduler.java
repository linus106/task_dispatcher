package com.phantom.taskmanager.scheduler;

import com.phantom.taskmanager.bean.Task;
import com.phantom.taskmanager.core.TaskManager;
import com.phantom.taskmanager.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 18:36
 * @Description TODO
 */
@Slf4j
@Component
public class LangrisserScheduler {


    @Scheduled(cron = "0 */1 * * * ?")
    public void test() {
        TaskManager.getInstance().addTask(Task.builder().taskId(UUID.randomUUID().toString()).build());
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void login() {
        TaskManager.getInstance().addTask(Task.builder().taskId("0").build());
    }

    @Scheduled(cron = "0 0 12 * * ?")
    public void hamberger12() {
        Task task = Task.builder().taskId("12").expiry(DateUtil.getTimeOfToday(12)).build();
        TaskManager.getInstance().addTask(task);
    }

    @Scheduled(cron = "0 0 18 * * ?")
    public void hamberger18() {
        TaskManager.getInstance().addTask(Task.builder().taskId("18").expiry(DateUtil.getTimeOfToday(20)).build());
    }

    @Scheduled(cron = "0 0 21 * * ?")
    public void hamberger21() {
        TaskManager.getInstance().addTask(Task.builder().taskId("21").expiry(DateUtil.getTimeOfToday(23)).build());
    }
}
