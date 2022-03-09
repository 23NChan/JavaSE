package DatagramSocketDemo.UDPRunnable;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo implements Runnable{
    DatagramSocket ds;

    public ReceiveDemo(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        while (true){
            //创建一个数据包接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用方法接收数据
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //解析数据并输出
            System.out.println(new String(dp.getData(),0,dp.getLength()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
