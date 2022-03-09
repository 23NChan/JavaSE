package FuntionalInterface.Funciton;

import java.util.function.Function;

public class FuncitonTest {
    public static void main(String[] args) {
        String s = "甘雨,20";
        convert(s, ss -> s.split(",")[1],Integer::parseInt,i-> i+70 );
    }

    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
