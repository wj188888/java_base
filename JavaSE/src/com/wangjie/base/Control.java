package com.wangjie.base;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * @author WangJie
 * @time 2024/1/5 21:33
 * @description
 */
public class Control {
    // 两个数之和,两数乘积。
    public static int sum(int aValue,int bValue){
        int sum=0;
        if (aValue>bValue){
            sum= aValue+bValue;
        }
        if (aValue<=bValue){
            sum= aValue*bValue;
        }
        return sum;

    }
    public static void dateTime(){
        // Date用于表示时间
        Date datetime = new Date();
        System.out.println("========当前时间：============");
        System.out.println(datetime);
        System.out.println("========日期：============");
        // LocalDate不可进行构造，适用于工厂模式
        LocalDate localDate = LocalDate.of(1991, 12, 3);
        // 获取月份的数字表示
        System.out.println(localDate.getMonthValue());
    }

    public static void riLiDate(){
        // 记录日历
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //date = date.minusDays(today);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println(" 星期一 星期二 星期三 星期四 星期五 星期六 星期天");
        for (int i=1;i<value;i++){
            System.out.print("      ");
        }
        System.out.printf("%6d",today);
        while (date.getDayOfMonth() == month){
            System.out.printf("%6d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue()!=1) System.out.println();
    }
    public static void main(String[] args) {
        //int sum = sum(12, 11);
        //System.out.println(sum);
        //dateTime();
        //riLiDate();
        //Employee1 employee = new Employee1("null");
        //Employee2 e2_1 = new Employee2(1);
        //Employee2 e2_2 = new Employee2(2);
        //System.out.printf("%2d",e2_1.getId());
        //System.out.printf("%2d",e2_2.getId());
        //System.out.println("----------------");
        //System.out.println(e2_1.getNextId());
        //System.out.println(e2_2.getNextId()); // 静态字段
        Test1 test1 = new Test1(1);
        test1.numTest();
    }

}

class Employee1{
    public Employee1(String name){
        // 对象为null作用，1.定位代码行，2.抛出不可为null
        name = Objects.requireNonNull(name,"The name cannot be null!");
        System.out.println(name);
    }

}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    // 构造函数
    public Employee(String n,double s,int year,int month,int day){
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){

        return this.salary;
    }
    public LocalDate getHireDay(){
        return this.hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}

class Employee2{
    // 静态字段static
    private static int nextId = 1001;
    private int id;

    public Employee2(int id){

        this.id = id;
    }
    public int getNextId(){
        return nextId;
    }
    public int getId(){
        return this.id;
    }
}

// 静态方法的应用：工厂方法
class Test1{
    private int testId;
    public Test1(int id){
        this.testId = id;
    }
    // currencyInstance货币表示和percentInstance百分比表示。
    public void numTest(){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double x = 0.01;
        System.out.println(currencyInstance.format(x));
        System.out.println(percentInstance.format(x));
    }
}