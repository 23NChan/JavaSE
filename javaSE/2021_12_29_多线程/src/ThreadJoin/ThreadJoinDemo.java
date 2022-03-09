package ThreadJoin;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 =new ThreadJoin();
        ThreadJoin tj2 =new ThreadJoin();
        ThreadJoin tj3 =new ThreadJoin();

        tj1.setName("申鹤");
        tj2.setName("甘雨");
        tj3.setName("神里");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();

    }
}
