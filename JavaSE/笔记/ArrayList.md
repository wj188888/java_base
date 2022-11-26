## 1.基本使用
> ArrayList是一个泛型容器，新建ArrayList需要实例化泛型参数。

```java
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(123);
        intList.add(456);
        intList.add(789);
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}
```

