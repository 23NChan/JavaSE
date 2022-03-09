package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);
        Collections.sort(list);
        System.out.println(list);   //[10, 20, 30, 40, 50]
        Collections.reverse(list);
        System.out.println(list);   //[50, 40, 30, 20, 10]
        Collections.shuffle(list);
        System.out.println(list);   //[40, 50, 10, 20, 30]
    }
}
