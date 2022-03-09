package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    collection集合存储字符串并遍历
     */
public class GenericDemo01 {
        public static void main(String[] args) {
            //创建集合对象
            Collection<String> c = new ArrayList<String>();

            //添加元素
            c.add("hello");
            c.add("world");
            c.add("java");
//            c.add(100);

            //遍历集合
            Iterator it = c.iterator();
            while(it.hasNext()){
//                Object obj = it.next();
//                System.out.println(obj);
                String s = (String) it.next(); //ClassCastException
                System.out.println(s);
            }

        }

}
