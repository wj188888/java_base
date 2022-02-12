package com.wangjie.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;  // 导入List
import java.util.Map;   // 导入Map

//
public class Test11 {
    public void test01(Map<String, User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String, User> test02() {
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getMethod("test01", Map.class, List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType); // 获得的genericParameterType是泛型
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
        /*
        代码注解：
        第一步：先去获取这个方法的泛型
        第二步：获得泛型参数类型对象，然后遍历这些参数类型
        第三步：如果这些泛型的参数类型是属于参数化类型的，就去获取这些泛型的真实参数类型
        第四步：将这些泛型真实的参数类型遍历打印出来
         */
        System.out.println("=================");
        Method method2 = Test11.class.getMethod("test02", null);

        Type genericParameterType = method2.getGenericReturnType();
        if (genericParameterType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
