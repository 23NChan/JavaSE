package TCP.TCPCase4;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket
        Socket s = new Socket("127.0.0.1",24232);
        //封装文本文件的数据
        BufferedReader br =new BufferedReader(new FileReader("JavaSE\\FileDemo\\TCPCase4.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        s.close();
    }
}
