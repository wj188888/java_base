package com.wangjie.Aug;

/**
 * @author WangJie
 * @time 2023/8/20 10:57
 * @description
 */
abstract class Shape {
    public abstract String toString();

    class Point extends Shape{
        public String toString() {
            return "Point";
        }
    }

    //class Rectangle extends Shape{
    //    public String toString() {
    //        return "Rectangle(width:" + witdh + ",height:" + height + ")";
    //    }
    //}
}
