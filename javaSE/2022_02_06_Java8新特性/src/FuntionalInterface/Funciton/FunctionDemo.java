package FuntionalInterface.Funciton;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        conver("100", s -> Integer.parseInt(s));
        conver("100", Integer::parseInt);
        conver(100, i -> String.valueOf(i + 566));
        conver("100", Integer::parseInt, i ->String.valueOf(i+566));
    }

    //定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void conver(String s, Function<String, Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个int类型的数值加上一个整数之后，转为字符串在控制台输出
    private static void conver(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    //定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void conver(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
//        Integer i = fun1.apply(s);
//        s = fun2.apply(i);
//        System.out.println(s);
        s = fun1.andThen(fun2).apply(s);
        System.out.println(s);
    }
}
