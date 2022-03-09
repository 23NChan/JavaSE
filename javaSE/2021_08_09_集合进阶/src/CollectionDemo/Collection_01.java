package CollectionDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class Collection_01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素: boolean add(E e)
        Boolean a = c.add("hello");   //验证add方法返回值
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);
        System.out.println(a);

    }
}
