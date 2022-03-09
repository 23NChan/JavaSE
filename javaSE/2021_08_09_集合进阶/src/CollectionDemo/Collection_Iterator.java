package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    iterator 迭代器

    Iterator:迭代器，集合的专用遍历方式
        Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
        迭代器是通过集合的iterator()方法得到的，所以我们说它依赖于集合而存在

    Iterator中的常用方法
        E next():返回迭代中的下一个元素
        boolean hasNext():如果迭代器具有更多元素，则返回 ture

 */
public class Collection_Iterator {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();
        /*
                public Iterator<E> iterator() {
                    return new Itr();
                }

                private class Itr implements Iterator<E> {
                    ....

         */

        //E next():返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
