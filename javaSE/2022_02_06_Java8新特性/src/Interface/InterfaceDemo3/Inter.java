package Interface.InterfaceDemo3;

public interface Inter {
    default void show1() {
        show();
        method();
        System.out.println("show1");
    }

    default void show2() {
        show();
        method();
        System.out.println("show2");
    }

    static void method1(){
        method();
        System.out.println("method1");
    }

    static void method2(){
        method();
        System.out.println("method2");
    }

    private void show(){
        System.out.println("private");
    }

    private static void method(){
        System.out.println("private static");
    }
}
