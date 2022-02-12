package com.wangjie.oop.demo03;

public class Application {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("wangjie");
        String yourname = student.getName();
        System.out.println(yourname);
//        try {
//            System.out.println(student.getName());
//        }catch (Exception ex) {
//            ex.printStackTrace();
//        }finally {
//            System.out.println("异常捕获最终执行内容");
//        }
        student.setId(1);
        int id = student.getId();
        student.setSex('男');
        char sex = student.getSex();
        System.out.println("id= "+id);
        System.out.println("sex= "+sex);

    }
}
