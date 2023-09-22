package com.wangjie.test;

/**
 * @Author WangJie
 * @Create by 2023/2/15 21:51
 * @Description
 */
public class NewField {
    public static void main(String[] args) {
        System.out.println();
        Employee e = new Employee(12, "wangjie");
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }

    //public Object getFieldValue(Object obj, String fieldName, Lookup lookup) throws NoSuchFieldException {
    //    Class cl = obj.getClass();
    //    Field field = cl.getDeclaredField(fieldName);
    //    VarHandle handle = MethodHandles.privateLookupIn(cl, lookup).unreflectVarHandle(field);
    //
    //    return handle.get(obj);
    //}
}
