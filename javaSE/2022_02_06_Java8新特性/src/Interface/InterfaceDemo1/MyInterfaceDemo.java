package Interface.InterfaceDemo1;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();


    }
}
