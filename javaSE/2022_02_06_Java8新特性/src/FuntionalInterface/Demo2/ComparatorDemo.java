package FuntionalInterface.Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        //定义集合、存储字符串元素
        ArrayList<String> array = new ArrayList<>();

        array.add("ccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");
        System.out.println("排序前" + array);

        Collections.sort(array);
        System.out.println("排序后" + array);

        Collections.sort(array, getComparator());
        System.out.println(array);

    }

    public static Comparator<String> getComparator() {
        //匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1,String s2) {
//                return s1.length() - s2.length();
//            }
//
//        };
        return (s1, s2) -> s1.length() - s2.length();


    }
}
