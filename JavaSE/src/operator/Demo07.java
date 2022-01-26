package operator;
public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        a+=b;
        a-=b;
        System.out.println(a+b+b);
        // 字符串连接符 +， string
        System.out.println(" " + b + a);
        // 前面是加号，后面有string，先输出加号，在连接字符串
        System.out.println(b + a+"wangjie");
    }
}
