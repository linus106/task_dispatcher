package com.phantom.taskmanager.bean;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 14:00
 * @Description TODO
 */
@Data
@Builder
public class Task {

    private String taskId;

    private String userName;

    private String password;

    private String type;

    private Date expiry;

}
