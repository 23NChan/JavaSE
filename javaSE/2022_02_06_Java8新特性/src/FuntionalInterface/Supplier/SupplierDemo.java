package FuntionalInterface.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(()->{
            return "八重神子";
        });
        System.out.println(s);

        Integer i = getint(()->30);
        System.out.println(i);
    }

    //定义一个方法返回一个字符串数据
    private static String getString(Supplier<String> sup){
        return sup.get();
    }

    //定义一个方法返回一个整数数据
    private static Integer getint(Supplier<Integer> sup){
        return sup.get();
    }
}
