package FuntionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("甘雨", s -> System.out.println(s));
        operatorString("甘雨", System.out::println);
        operatorString("八重神子", s -> System.out.println(new StringBuilder(s).reverse().toString()));

        operatorString("八重神子",s-> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));
        operatorString("八重神子",s-> System.out.println(new StringBuilder(s).reverse().toString()),s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    //定义一个方法，用不同的方法是消费同一个字符串两次
    private static void operatorString(String name, Consumer<String> con) {

        con.accept(name);
    }
}
