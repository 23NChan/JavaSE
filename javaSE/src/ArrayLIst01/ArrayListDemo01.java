package ArrayLIst01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array);
        array.add("hello");
        System.out.println(array);
        array.add("world");
        System.out.println(array);
        array.add(1,"xishuai");
        System.out.println(array);
    }
}
