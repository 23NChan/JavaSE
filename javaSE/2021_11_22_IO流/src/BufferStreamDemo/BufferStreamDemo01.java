package BufferStreamDemo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos=new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\BufferStreamDemo\\fos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\BufferStreamDemo\\fos.txt"));
        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));
        bos.close();

        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("javaSE\\2021_11_22_IO流\\src\\BufferStreamDemo\\fos.txt"));

        //一次读取一个字节数据
//        int by;
//        while((by=bis.read())!=-1){
//            System.out.print((char)by);
//        }
        //一次读一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.print(new String(bys));
        }
        bis.close();
    }
}
