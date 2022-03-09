package DatagramSocketDemo.UDPRunnable;

import java.net.DatagramSocket;
import java.net.SocketException;

public class mainDemo {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds =new DatagramSocket(24232);

        ReceiveDemo rd = new ReceiveDemo(ds);
        SendDemo sd = new SendDemo(ds);

        Thread receive = new Thread(rd,"receive");
        Thread send = new Thread(sd,"send");

        receive.start();
        send.start();
    }
}
