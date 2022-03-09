package TCP.TCPCase2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建Sockek
        ServerSocket ss = new ServerSocket(24232);
        //监听客户端连接
        Socket s = ss.accept();
        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //接收数据并输出
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //释放资源
        ss.close();
    }
}
