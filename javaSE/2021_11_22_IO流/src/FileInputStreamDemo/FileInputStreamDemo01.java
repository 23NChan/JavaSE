package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("javaSE\\2021_11_22_IO流\\src\\FileInputStreamDemo\\fos.txt");

        //调用字节输入流对象的读数据方法
//        int by = fis.read();
//        System.out.println(by); //97
//        System.out.println((char)by); //a
//        int by2 = fis.read(); //98
//        System.out.println(by2);
//        int by3 = fis.read(); //98
//        System.out.println(by3); //-1
        //如果达到文件的末尾返回-1
        int by;
        while ((by=fis.read()) != -1){
            System.out.print((char) by);
        }

        //释放资源
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
