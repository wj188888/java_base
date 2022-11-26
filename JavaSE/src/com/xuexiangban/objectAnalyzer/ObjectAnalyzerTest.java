package com.xuexiangban.objectAnalyzer;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.*;
/**
 * @Classname ObjectAnalyzerTest
 * @Date 2022/11/22 22:14
 * @Author wangjie
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) throws ReflectiveOperationException {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i=1; i<= 5; i++) {
            squares.add(i*i);
            System.out.println(new ObjectAnalyzer().toString(squares));
        }
    }
}
