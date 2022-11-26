package com.xuexiangban.reflection;
import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.*;
import java.lang.reflect.*;

/**
 * @Classname ReflectionTest
 * @Date 2022/11/21 19:35
 * @Author wangjie
 */
public class ReflectionTest {
    public String salary;
    public int age;

    public static void main(String[] args) {

        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g java.util.Date):");
            name = in.next();
        }

        try {
            // 找到类对象的类信息
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers()); // 获取类对象的信息，public、protected、private
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println("class " + name);
            if (supercl != null && supercl != Object.class) System.out.println("extends " + supercl.getName());
            System.out.println("\n{\n");
            //printConstructors(cl);
            //System.out.println();
            //printMethods(cl);
            //System.out.println();
            printFields(cl);
            System.out.println("}");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printConstructors(Class cl) {
        /*
         * 构造器
         */
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c: constructors) {
            String name = c.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j=0; j <paramTypes.length; j++) {
                if (j >0 ) System.out.println(", ");
                System.out.println(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m: methods) {
            Class retType = m.getReturnType(); // void
            String name = m.getName(); // 方法名称

            System.out.println("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes(); // 参数列表
            for (int j=0; j < paramTypes.length; j++) {
                if (j > 0) System.out.println(", ");
                System.out.println(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for(Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
