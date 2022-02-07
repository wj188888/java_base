package oop.demo13;

public class Test {
    public static void main(String[] args) {
        // 没有名字初始化类,不用将实例保存在变量中
        new Apple().eat();
        UserService userService = new UserService(){
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        userService.hello(); // 调用这个接口
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
    void hello();
}