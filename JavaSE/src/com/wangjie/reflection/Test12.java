package com.wangjie.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// 练习反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.wangjie.reflection.Students");


        // 通过反射获取到注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解的value的值
        TableWang tableWang = (TableWang)c1.getAnnotation(TableWang.class);
        String value = tableWang.value();
        System.out.println(value);

        // 获得类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldWang annotation = f.getAnnotation(FieldWang.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }

}

@TableWang("db_student")
class Students{
    @FieldWang(columnName="db_id", type="int", length = 10)
    private int id;
    @FieldWang(columnName="db_age", type="int", length = 10)
    private int age;
    @FieldWang(columnName="db_name", type="varchar", length = 3)
    private String name;

    // 无参构造器,显示的调用出来
    public Students() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableWang{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldWang{
    String columnName();
    String type();
    int length();
}