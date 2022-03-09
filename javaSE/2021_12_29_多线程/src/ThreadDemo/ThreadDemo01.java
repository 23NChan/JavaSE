package ThreadDemo;

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("m1: ");
        my2.setName("m2: ");
        my1.start();
        my2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
