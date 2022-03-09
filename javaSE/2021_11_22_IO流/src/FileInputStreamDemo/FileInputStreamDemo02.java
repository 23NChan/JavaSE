package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("javaSE\\2021_11_22_IO流\\src\\FileInputStreamDemo\\a.jpg");

        //根据目的创建字节  输出流对象
        FileOutputStream fos = new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\FileInputStreamDemo\\b.jpg");

        //读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }

}
