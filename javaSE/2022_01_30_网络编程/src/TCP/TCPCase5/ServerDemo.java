package TCP.TCPCase5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket
        ServerSocket ss = new ServerSocket(24232);
        //监听客户端
        Socket s = ss.accept();
        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("javaSE\\FileDemo\\TCPCase3.txt"));

        String line;
        while ((line=br.readLine())!=null){
            //if ("886".equals(line)){
            //    break;
            //}
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放内存
        bw.close();
        ss.close();
    }
}
