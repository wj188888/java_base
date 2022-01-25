public class Demo04 {
    // 实例变量,类中方法外;如果不设置就会有个默认值
    String name= "马思密达看什么";
    int age = 1;
    // 类变量
    static double salary = 23211; // 随着类的消失和产生



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
    }
}
/**
 * 类变量：要加一个static
 * 实例变量：String str = "hello world";
 */
