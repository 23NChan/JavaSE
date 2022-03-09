package MethodReference.MethodReferenced1;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(s -> System.out.println(s));

        //方法引用符::
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable printable) {
        printable.printString("hello world");
    }
}
