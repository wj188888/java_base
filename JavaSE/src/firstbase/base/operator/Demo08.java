package firstbase.base.operator; // 定义包必须放在最上面
//import .. 导入包
// * 是通配符

public class Demo08 {
    public static void main(String[] args) {
        int score = 80;
        String type = score <60 ?"不及格":"及格"; // 必须掌握
        System.out.println(type);
        boolean X = false;
        System.out.println(type+score);
    }
}
