package exception;

// 自定义异常类
// 要继承Exception这个类才是异常类
public class MyException extends Exception{
    // c传递数字-》10；
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    // toString, 异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
