package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 动态的创建对象，通过反射
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("reflection.User");
        System.out.println("c1="+c1);

        // 构造一个对象
        User user = (User)c1.newInstance(); // 本质是调用了类的无参构造器
        user.setSex('男');
        System.out.println(user.getSex());

        // 通过（不是无参构造器，是有参的构造器）构造器-》创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)declaredConstructor.newInstance("王杰",1,18);
        System.out.println(user2);

        // 通过反射调用-》普通方法
        System.out.println("==========获取方法=========");
        User user3= (User)c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke("昂捷"); // invoke激活 //（对象， "方法的值"）
        System.out.println(user3.getName());

        // 通过反射操作-》属性
        System.out.println("==========获取属性=========");
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        name.setAccessible(true); // 属性是私有的，我们把这个权限关掉，就可以进行属性的访问了
        name.set(user4, "王杰"); // 属性是私有的，不能直接操作，需要先关闭安全检测
        System.out.println(user4.getName());
    }
}
