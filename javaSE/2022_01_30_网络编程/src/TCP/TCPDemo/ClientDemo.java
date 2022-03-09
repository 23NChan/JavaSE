package TCP.TCPDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        Socket s = new Socket(InetAddress.getByName("192.168.107"),24232);
        //创建客户端的Socket对象
        Socket s = new Socket("192.168.0.107",24232);

        //获取输出流，写数据
        //OutputStreamgetOutputStream返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes(StandardCharsets.UTF_8));

        //释放资源
        s.close();
    }
}
