package exception;

public class Test01 {
    public static void main(String[] args) {

        try {
            new Test01().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        // finally 可以不要，对于I/O和资源，关闭等操作;
    }
    // 假设在方法中，处理不来这个异常。就一直向上抛出，直到处理完成.;throws是方法抛出这个异常
    public void test(int a, int b) throws ArithmeticException{
        if (b==0) {
            // 主动抛出异常
            throw new ArithmeticException(); // 一般在方法中使用,主动抛出异常
        }
        System.out.println(a/b);
    }
}
// 假设要捕获多个异常，要捕获小的开始，再捕获大的异常

/*
        // 假设要捕获多个异常，要捕获小的开始，再捕获大的异常

        try { //try监控区域
            System.out.println(c/d);
        }catch (ArithmeticException ex){ // catch（想要捕获的异常类型） .Throwable是最大的异常
            System.out.println("ArithmeticException抛出的报错,程序出现异常,变量b不能为0");
        } catch (Error ex){
            System.out.println("Error抛出的异常");
        } catch (Exception ex){
            System.out.println("Exception抛出的报错");
            ex.printStackTrace(); // 打印错误的栈信息
        }catch (Throwable ex){
            System.out.println("Throwable抛出的报错");
        }finally {
            System.out.println("finally最后都会执行的内容");
        }
 */