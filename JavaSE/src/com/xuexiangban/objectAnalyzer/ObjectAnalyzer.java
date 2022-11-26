package com.xuexiangban.objectAnalyzer;

import sun.reflect.Reflection;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @Classname ObjectAnalyzer
 * @Date 2022/11/22 22:01
 * @Author wangjie
 */
public class ObjectAnalyzer {

    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj)
        throws ReflectiveOperationException {
            if (obj == null) return "null";
            if (visited.contains(obj)) return "...";
            visited.add(obj);
            Class cl = obj.getClass();
            if (cl == String.class) return (String) obj;
            if (cl.isArray()) {
                String r = cl.getComponentType() + "[]{";
                for (int i=0; i< Array.getLength(obj); i++) {
                    if (i > 0) r += ",";
                    Object val = Array.get(obj, i);
                    if (cl.getComponentType().isPrimitive()) r += val;
                    else r += toString(val);
                }
                return r + "}";
            }
            String r = cl.getName();
            do {
                r += "[";
                Field[] fields = cl.getDeclaredFields();
                AccessibleObject.setAccessible(fields, true);
                for (Field f: fields) {
                    if (!Modifier.isStrict(f.getModifiers())) {
                        if (!r.endsWith("[")) r += ",";
                        r += f.getName() + "=";
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive()) r += val;
                        else r += toString(val);
                    }
                }
                r += "]";
                cl = cl.getSuperclass();
            }
            while (cl != null);
            return r;
        }
    }
