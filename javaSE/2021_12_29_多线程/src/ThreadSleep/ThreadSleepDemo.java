package ThreadSleep;

import ThreadPriority.ThreadPriority;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep tp1 = new ThreadSleep();
        ThreadSleep tp2 = new ThreadSleep();
        ThreadSleep tp3 = new ThreadSleep();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
