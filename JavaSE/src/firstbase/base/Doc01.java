package firstbase.base;

/*
javadoc
命令是用来生产自己的api文档的

参数信息
@author 类作者
@version 版本号
@since 指明最需要最早使用的jdk版本
@param 参数名
@return 返回值情况
@throws 抛出异常情况
 */
public class Doc01 {
    String name;
    public String test(String name) throws Exception{
        return name;
        /*
        javadoc
        命令是用来生产自己的api文档的

        参数信息
        @author 作者名
        @version 版本号
        @since 指明最需要最早使用的jdk版本
        @param 参数名
        @return 返回值情况
        @throws 抛出异常情况
         */
    }
//    public static void main(String[] args) {
//
//
//    }
    /*
    在IDEA中生成javadoc内容：
    第一步： 在tools中Generate JavaDoc，选择当前文件
    -encoding UTF-8 -charset UTF-8 -windowtitle "接口wiki" -link http://docs.Oracle.com/javase/7/docs/api
     */
}