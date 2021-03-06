package org.fms.eis.webapp.helper;

import java.util.Calendar;
import java.util.Date;

public class UtilityHelper {

    //限制获取条目数量
    public static final Integer LimitCount=10000;

    /**
     * 用正则表达式进行判断ip地址
     */
    public static boolean isIPAddressByRegex(String str) {
        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        // 判断ip地址是否与正则表达式匹配
        if (str.matches(regex)) {
            String[] arr = str.split("\\.");
            for (int i = 0; i < 4; i++) {
                int temp = Integer.parseInt(arr[i]);
                //如果某个数字不是0到255之间的数 就返回false
                if (temp < 0 || temp > 255) return false;
            }
            return true;
        } else return false;
    }

    /**
     * 正则表达式验证邮箱
     */
    public static boolean isEmail(String email) {
        if (email == null || "".equals(email)) return false;
        String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        return email.matches(regex);
    }

    /**
     * 正则表达式验证手机
     */
    public static boolean orPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || "".equals(phoneNumber))
            return false;
        String regex = "^1[3|4|5|8][0-9]\\d{8}$";
        return phoneNumber.matches(regex);
    }

    /**
     * 获取某个月份天数
     *
     * @param date
     * @return
     */
    public static int getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 年月日获取Date时间
     * @return
     */
    public static Date getDate(Integer year,Integer month,Integer day){
        Calendar calendar=Calendar.getInstance();
        calendar.set(year, month, day);  //年月日  也可以具体到时分秒如calendar.set(2015, 10, 12,11,32,52);
        Date date=calendar.getTime();//date就是你需要的时间
        return date;
    }
}
