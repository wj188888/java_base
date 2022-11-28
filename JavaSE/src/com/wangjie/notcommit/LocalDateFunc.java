package com.wangjie.notcommit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Classname LocalDateFunc
 * @Date 2022/11/27 10:18
 * @Description LocalDate时间日期类，学习
 * @Author wangjie
 */
public class LocalDateFunc {

    private LocalDate birthDay;

    public LocalDateFunc() {
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        LocalDateFunc t1 = new LocalDateFunc();
        t1.setBirthDay(LocalDate.now());
        System.out.println(t1.getBirthDay());

        /*
         * 这将返回一个带有指定的epoch-day的LocalDate。
         * EPOCH_DAY是一个简单的天数递增计数，其中第0天是1970-01-01。负数代表早期。
         * 比如params：10000天就是1997-05-19
         */
        t1.setBirthDay(LocalDate.ofEpochDay(10000));
        System.out.println(t1.getBirthDay());
        // of 指定日期
        t1.setBirthDay(LocalDate.of(1922,10,21));
        System.out.println(t1.getBirthDay());
        // 选定年份，year -表示的年份，从MIN_YEAR到MAX_YEAR。dayOfYear -表示的日期，从1到366
        t1.setBirthDay(LocalDate.ofYearDay(2022,331));
        System.out.println(t1.getBirthDay());
        // 日期的最大值和最小值
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        CharSequence c_seq = "2022-11-24";
        t1.setBirthDay(LocalDate.parse(c_seq));
        System.out.println(t1.getBirthDay());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm:ss");
        //LocalDate.parse(c_seq, dtf);
        String c_seq2 = "2021 10 21 12:45:10";
        LocalDate t2 = LocalDate.parse(c_seq2, dtf);
        System.out.println(t2.toString());
    }
}
