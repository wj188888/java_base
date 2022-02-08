package annotation.demo01;

import java.lang.annotation.*;

@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test01(){

    }
}
// 定义一个注解, Target表示我们的注解可以运行在哪些地方
@Target(value= {ElementType.METHOD, ElementType.TYPE}) // 给定范围
// @Retention(RetentionPolicy.RUNTIME) // 表示注解在什么时候才有效
    // runtime > class > sources
@Retention(RetentionPolicy.RUNTIME)
// Ducumented 表示是否将我们的注解生成在JAVAdoc中
@Documented
// Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
