package Lambda.LambdaDemo1;

public class LamdaDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t =new Thread(mr);
        t.start();

        //匿名内部类的方式改进
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();

        //Lambda表达式方式改进
        new Thread(()->{
            System.out.println("多线程程序启动了");
        }).start();
    }
}
