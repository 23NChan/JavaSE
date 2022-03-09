package Interface.InterfaceDemo2;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        i.show2();
        Inter.test();
    }
}
