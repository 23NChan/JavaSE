package FuntionalInterface.Predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"甘雨,18", "宵宫,17", "神里凌华,19", "八重神子,20" };
        ArrayList<String> arrayList = myFilter(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 18);
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> array = new ArrayList<>();

        //遍历数组
        for (String s : strArray) {
            if (pre1.and(pre2).test(s)) {
                array.add(s);
            }
        }
        return array;
    }
}
