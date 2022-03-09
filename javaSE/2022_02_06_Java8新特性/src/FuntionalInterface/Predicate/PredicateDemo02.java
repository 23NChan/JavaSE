package FuntionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo02 {
    public static void main(String[] args) {
        System.out.println(checkString("hello", s -> s.length() > 8, s -> s.length() < 15));
        System.out.println(checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15));

    }

    //同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        /**
         boolean b1 =pre1.test(s);
         boolean b2 =pre2.test(s);
         boolean b = b1 && b2;
         return b;
         */
//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);
    }
}
