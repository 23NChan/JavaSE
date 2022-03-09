package TCP.TCPCase1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket(Socket)
        Socket s  = new Socket("127.0.0.1",24232);

        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp".getBytes(StandardCharsets.UTF_8));

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端"+data);

        //释放资源
        s.close();
    }
}
