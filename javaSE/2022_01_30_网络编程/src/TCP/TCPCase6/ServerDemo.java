package TCP.TCPCase6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(24232);
        while (true) {
            //监听客户端连接返回一个对应的Socket
            Socket s = ss.accept();
            //为每一个用户开启一个线程
            new Thread(new ServerThread(s)).start();
        }
    }
}
