package com.phantom.taskmanager.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 18:54
 * @Description TODO
 */
@Data
@Builder
public class Account {

    private String id;

    private String userName;

    private String password;
}
