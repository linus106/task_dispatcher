package com.phantom.taskmanager.core;

import com.phantom.taskmanager.bean.Task;
import com.phantom.taskmanager.utils.DateUtil;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 14:47
 * @Description TODO
 */
public class TaskManager {

    private ArrayBlockingQueue<Task> taskQueue;

    private static class InstatnceHolder {
        private static final TaskManager INSTANCE = new TaskManager();
    }

    public static TaskManager getInstance() {
        return InstatnceHolder.INSTANCE;
    }

    private TaskManager() {
        taskQueue = new ArrayBlockingQueue<>(1000);
    }

    public Task claimOneTask() {
        while(true) {
            Task task = taskQueue.poll();
            if (task == null) {
                return null;
            }
            if (!DateUtil.isOverTime(task.getExpiry())) {
                return task;
            }
        }
    }

    public boolean addTask(Task task) {
        return taskQueue.offer(task);
    }


}
