package com.phantom.taskmanager.utils;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author za-wangxiangyu
 * @Date 2019/3/8 18:08
 * @Description TODO
 */
public class DateUtil {

    public static boolean isOverTime(Date expire) {
        if (expire == null) {
            return false;
        }
        return Calendar.getInstance().getTime().after(expire);
    }


    public static Date getTimeOfToday(Integer hour) {
        return getTimeOfToday(hour, 0);
    }

    public static Date getTimeOfToday(Integer hour, Integer minute) {
        Date now = Calendar.getInstance().getTime();
        DateUtils.setHours(now, hour);
        DateUtils.setMinutes(now, minute);
        return now;
    }

}
