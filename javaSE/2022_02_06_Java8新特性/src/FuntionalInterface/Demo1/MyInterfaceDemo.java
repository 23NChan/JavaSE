package FuntionalInterface.Demo1;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        InterfaceDemo my = () -> System.out.println("函数式接");
        my.show();
    }
}
