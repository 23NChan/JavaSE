package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo03 {
    //String(byte[] bytes,int offset,int length)
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("javaSE\\2021_11_22_IO流\\src\\FileInputStreamDemo\\fos.txt");

        byte[] bys = new byte[5];

//        int len = fis.read(bys); //第一次读取
//        System.out.println(new String(bys)); //hello
//        System.out.println(len);
//        len = fis.read(bys);
//        System.out.println(new String(bys));
//        /* 第二次读取
//        /r/n
//        wor
//         */
//        len = fis.read(bys);
//        System.out.println(new String(bys));
//        /*
//        ld
//        j
//         */
        int len;
        while((len=fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        fis.close();
    }
}
