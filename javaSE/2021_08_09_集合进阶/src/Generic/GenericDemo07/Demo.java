package Generic.GenericDemo07;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("hello", "world", "java");
        //list.add("javase");   //UnsupportedOperationException
        //list.remove("world");//UnsupportedOperationException
        list.set(1, "javase");
        System.out.println(list);

        List<Object> of = List.of("hello", "world", "java");

        //of.add("javaee");//UnsupportedOperationException
        //of.set(1,"javaee");//UnsupportedOperationException
        System.out.println(of);

        //Set<String> set = Set.of("hello", "world", "java","world");//IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");
        System.out.println(set);

    }
}
