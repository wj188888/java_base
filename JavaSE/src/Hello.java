public class Hello {
    public static void main(String[] args) {
        // 单行注释，输出一个hello， world！
        System.out.println("Hello World!!!");
        /*
        多行注释
        */
        String $niu = "wangjie";
        String EREa = "name"; // 必须是双引号
        System.out.println(EREa);
        String a = "sdja;fkal;d";
        System.out.println(a);
        int num = 10;
        System.out.println(num);
        long num2 =100L;
        System.out.println(num2);
        // 小数
        float str2= 12.223F;
        System.out.println(str2);
        double num6 = 12.321412123112;
        System.out.println(num6);
        // 布尔类型
        boolean F = false;
        System.out.println(getType(F));
    }
    private static String getType(Object objects) {
        return objects.getClass().toString();

    }
}
// 强类型语言
// 基本类型和引用类型
// 引用数据类型， 类，接口，数组等都是；
