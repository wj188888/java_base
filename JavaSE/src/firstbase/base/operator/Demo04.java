package firstbase.base.operator;
public class Demo04 {
    // 实例变量,类中方法外;如果不设置就会有个默认值
    String name= "马思密达看什么";
    int age = 1;
    // 类变量
    static double salary = 23211; // 随着类的消失和产生

    static final double PI = 3.14; // 每次都可以调用的常量

    public static void main(String[] args) {
        String name = "qingsdasf";

        char x = 'x';
        double pi = 3.14;
        System.out.println(x);
        System.out.println(pi);
        // 变量类型 ，只有类对象实例化后才可以去引用；bool默认是false
        Demo04 demo04 = new Demo04();
        System.out.println(demo04.name);
        System.out.println(demo04.age);
        // 类变量是带有static
        System.out.println(salary);
        System.out.println(PI);
        final double PIY = 3.14;
        System.out.println(PIY);

        // 短路运算
        int c = 5;
        boolean d = (c>4)&&(c++<4);
        System.out.println("d: "+d);
        System.out.println(c);
    }
}
/*
 * 类变量：要加一个static
 * 实例变量：String str = "hello world";
 * 方法属性：
 * 常量：final 名 = 值
 */

/*
 * 变量的命名规范；
 * 所有的变量丶方法丶类名
 * 类成员：首字母小写和驼峰：monthSalary 除了第一个单词以外，后面的单词首字母大写
 * 局部变量：首字母小写和驼峰原则
 * 常量：大写字母和下划线： max value
 * 类名： 首字母大写和驼峰原则： man， goodman
 * 方法名： 首字母小写和驼峰原则：run(),runRun()
 */