package DatagramSocketDemo;

import java.io.IOException;
import java.net.*;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据报用于接收数据
        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data,data.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
        ds.close();

        //解析数据包并展示
        byte[] bys = dp.getData();
        int len = dp.getLength();
        String s = new String(bys, 0,len);
        System.out.println(s);
    }


}
