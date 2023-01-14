package com.wangjie.javaCoreTech.day03;

import java.util.ArrayList;

/**
 * @Author WangJie
 * @Create by 2023/1/14 19:16
 * @Description 生成一个ArrayList数组
 */
public class Employee04 {
    private int id;
    private String name;

    public Employee04(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Employee04> staff = new ArrayList<Employee04>();
        staff.add(new Employee04(1, "wangjie"));
        staff.add(new Employee04(2, "zhangshan"));
        staff.add(new Employee04(3, "lisi"));
        for (Employee04 stf : staff){
            System.out.println(stf.getId() + ": " + stf.getName());
        }
        System.out.println(staff.size());

        // 用于修改已存在的ArrayList数组元素;
        staff.set(0, new Employee04(4, "哈士奇"));
        System.out.println("====");
        for (Employee04 stf : staff){
            System.out.println(stf.getId() + ": " + stf.getName());
        }
    }
}
