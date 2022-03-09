package FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01{
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos =new FileOutputStream("javaSE\\2021_11_22_IO流\\src\\FileOutputStreamDemo\\fos.txt");
        /*
            做了三件事
                1：调用系统功能创建了文件
                2：创建了字节输出流对象
                3：让字节输出流对象指向创建好的对象
         */

        fos.write(97);  //a
        fos.write(57);  //9
        fos.write(55);  //7

        //所有和io的操作最后都要释放资源
        //void close(): 关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}
