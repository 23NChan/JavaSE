package FuntionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> {
            return s.length() > 8;
        });
        System.out.println(b1);
        System.out.println(checkString("helloworld",s->s.length()>8));
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
        return pre.negate().test(s);
    }
}
