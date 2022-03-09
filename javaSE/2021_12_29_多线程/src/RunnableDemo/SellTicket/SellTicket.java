package RunnableDemo.SellTicket;

public class SellTicket implements Runnable {
    private static int tickets2 = 100;
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {

//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (this) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + this.tickets + "票");
//                    this.tickets--;
//                }
//            }
//        }

        while (true) {
            synchronized (SellTicket.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets2 > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets2 + "票");
                    tickets2--;
                }
            }
        }
    }

    public synchronized void sellTicket() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + this.tickets + "票");
            this.tickets--;
        }
    }

    public static synchronized void sellTicket2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tickets2 > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets2 + "票");
            tickets2--;
        }
    }

}
