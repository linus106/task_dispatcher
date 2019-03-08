package com.phantom.taskmanager.web;

import com.phantom.taskmanager.bean.Task;
import com.phantom.taskmanager.core.TaskManager;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 13:57
 * @Description TODO
 */
@RestController
@RequestMapping("/api/v1/task")
public class TaskController {



    @GetMapping(value = "" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Task claimOneTask(@RequestParam(value = "type", required = false) String type) {
         return TaskManager.getInstance().claimOneTask();
    }

}
