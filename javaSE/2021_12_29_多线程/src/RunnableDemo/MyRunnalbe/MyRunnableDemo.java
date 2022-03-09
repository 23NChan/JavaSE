package RunnableDemo.MyRunnalbe;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread T1 = new Thread(my,"T1");
        Thread T2 = new Thread(my,"T2");

        T1.start();
        T2.start();

    }
}
