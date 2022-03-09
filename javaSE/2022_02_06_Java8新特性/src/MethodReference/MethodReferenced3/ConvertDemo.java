package MethodReference.MethodReferenced3;

import Interface.InterfaceDemo3.Inter;

public class ConvertDemo {
    public static void main(String[] args) {
        useConverter(s -> Integer.parseInt(s));

        //引用方法
        useConverter(Integer::parseInt);
        //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    }

    private static void useConverter(Converter c) {
        int convert = c.convert("666");
        System.out.println(convert);
    }
}
