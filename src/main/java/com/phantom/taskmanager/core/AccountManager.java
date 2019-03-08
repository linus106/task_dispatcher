package com.phantom.taskmanager.core;

import com.phantom.taskmanager.bean.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 18:54
 * @Description TODO
 */
public class AccountManager {

    private List<Account> accountList;

    private AccountCache accountCache;

    private static class InstatnceHolder {
        private static final AccountManager INSTANCE = new AccountManager();
    }

    public static AccountManager getInstance() {
        return AccountManager.InstatnceHolder.INSTANCE;
    }

    private AccountManager() {
        accountList = new ArrayList<>();
        //TODO
    }

    public List<Account> getAllAccount() {
        return accountList;
    }


}
