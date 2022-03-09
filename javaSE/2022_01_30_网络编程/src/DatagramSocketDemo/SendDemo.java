package DatagramSocketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        byte[] bys = "hello,udp我来了".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.0.107");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.0.107"),10086);

        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
