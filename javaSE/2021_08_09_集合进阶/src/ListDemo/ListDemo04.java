package ListDemo;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList,LinkedList
        ArrayList:底层数据结构是数组，查询快，增删慢
        LInkedList:底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo04 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("++++++++++++++");

        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("hello");
        linkedlist.add("world");
        linkedlist.add("javal");

        for (String s :linkedlist){
            System.out.println(s);
        }

    }
}
