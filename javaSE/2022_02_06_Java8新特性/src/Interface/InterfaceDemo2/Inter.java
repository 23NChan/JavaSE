package Interface.InterfaceDemo2;

public interface Inter {
    void show1();

    default void show2(){
        System.out.println("默认方法");
    }

    static void test(){
        System.out.println("静态方法");
    }
}
