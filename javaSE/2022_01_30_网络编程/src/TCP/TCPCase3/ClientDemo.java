package TCP.TCPCase3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket
        Socket s = new Socket("127.0.0.1",24232);

        //数据来自键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line= br.readLine())!=null) {
            if ("886".equals(line)){
                break;
            }
            //获取输出流对象
            //OutputStream os = s.getOutputStream();
            //os.write(line.getBytes(StandardCharsets.UTF_8));
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
