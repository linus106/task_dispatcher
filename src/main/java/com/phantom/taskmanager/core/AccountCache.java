package com.phantom.taskmanager.core;

import com.phantom.taskmanager.bean.Account;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 19:18
 * @Description TODO
 */
@Component()
public class AccountCache {

    private List<Account> accountList;

    @Value("classpath:static/data/account.json")
    private Resource accountJson;

    @PostConstruct
    public void init() throws IOException {
        String areaData =  IOUtils.toString(accountJson.getInputStream(), Charset.forName("UTF-8"));
        // TODO

    }



    public List<Account> getAll() {
        return accountList;
    }

    public void add(Account account) {
        accountList.add(account);
    }
}
